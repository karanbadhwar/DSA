import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling");

        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter a letters");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            System.out.println("End");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}