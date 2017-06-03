package modulo6.optional;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by JavierSainz on 6/3/17.
 */
public class BookTest {
    static AtomicInteger counter = new AtomicInteger();

    static Book createBook() {
        List<Chapter> chapters = IntStream.range(1, 11)
                .mapToObj(i -> new Chapter(Optional.of("Chapter " + i)))
                .collect(Collectors.toList());
        return new Book(chapters);
    }

    public static void main(String[] args) {
        Book book = createBook();
        int summaryLength = book.getChapter(5)
                .flatMap(Chapter::getSummary)
                .map(String::length)
                .orElse(0);
        System.out.println(summaryLength);

    }
}

class Book {
    private Optional<List<Chapter>> chapters;

    public Book(List<Chapter> chapters) {
        this.chapters = Optional.ofNullable(chapters);
    }

    public Optional<List<Chapter>> getChapters() {
        return chapters;
    }

    public Optional<Chapter> getChapter(int chapterNumber) {
        if (chapterNumber < 1) {
            throw new IllegalArgumentException("Illegal argument");
        }
        if (chapterNumber > (chapters.isPresent() ? chapters.get().size() : 0)) {
            return Optional.empty();
        }
        return Optional.ofNullable(chapters.get().get(chapterNumber - 1));
    }
}

class Chapter {
    private Optional<String> summary;

    public Chapter(Optional<String> summary) {
        this.summary = summary;
    }

    public Optional<String> getSummary() {
        return summary;
    }
}