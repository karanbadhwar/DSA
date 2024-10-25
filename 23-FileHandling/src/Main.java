import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling");

        //READER ---------->
//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            System.out.println("Enter a letters");
//            int letters = isr.read();
//            while (isr.ready()) {
//                System.out.println((char) letters);
//                letters = isr.read();
//            }
//            System.out.println("End");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        try (FileReader fr = new FileReader("C:\\Users\\kbb91\\Desktop\\DSA\\23-FileHandling\\notes2.txt")) {
//            int letters = fr.read();
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//            System.out.println("End");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kbb91\\Desktop\\DSA\\23-FileHandling\\notes2.txt"))) {
//            while(br.ready()) {
//                System.out.println(br.readLine());
//            }
//
//        } catch(IOException e) {
//            System.out.println(e.getMessage());
//        }

        //WRITER ---------->

//        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
//            osw.write("Hello World");
//            osw.write("\n");
//            osw.write(97);
//            osw.write("\n");
//            char[] arr = "hello world".toCharArray();
//            osw.write(arr);
//            osw.write("😊");
//        }

//        try (FileWriter fw = new FileWriter("notes2.txt", true)) {
////            fw.write("Hello World"); // It will override the original File
//            fw.write("Hello world, my name is karan"); // After adding True in constructor it will now append into original file
//        } catch( IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes2.txt"))) {
            bw.write("Hare Krishna");
        } catch( IOException e) {
            System.out.println(e.getMessage());
        }
    }
}