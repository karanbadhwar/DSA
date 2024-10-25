import java.io.*;

public class FileImpl {
    public static void main(String[] args) {
        //Create new File
        try {
        File fo = new File("new-file.txt");
        fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Writing on the fIle
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज, अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Reading from a file
        try {
            BufferedReader br = new BufferedReader(new FileReader("new-file.txt"));
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        }

        //Create new File and deleting
        try {
            File fo = new File("random.txt");
            fo.createNewFile();
            if (fo.delete()) {
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
