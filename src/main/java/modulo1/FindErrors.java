package modulo1;

import java.io.IOException;
import java.time.format.DateTimeParseException;

/**
 * Created by JavierSainz on 5/5/17.
 */
public class FindErrors {
    public void doesNotCompile() {  // METHOD DOES NOT COMPILE
        /**try {
            mightThrow();
        } catch (FileNotFoundException | IllegalStateException e) {
        } catch (InputMismatchException e |MissingResourceException e){
        } catch(SQLException | ArrayIndexOutOfBoundsException e){
        } catch(FileNotFoundException | IllegalArgumentException e){
        } catch(Exception e){
        } catch(IOException e){
        }*/
    }

    private void mightThrow() throws DateTimeParseException, IOException {
    }
}
