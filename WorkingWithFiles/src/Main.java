import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }


    public static void createFile() {
        File file = new File("C:\\xampp\\htdocs\\LESSONS\\Aranan Programci Olma\\java\\__FILES__\\students.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Dosya olustu");
            } else {
                fileInfo();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileInfo() {
        File file = new File("C:\\xampp\\htdocs\\LESSONS\\Aranan Programci Olma\\java\\__FILES__\\students.txt");
        if(file.exists()) {
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getFreeSpace());
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println(file.getParent());

        }
    }
    public static void readFile() {
        File file = new File("C:\\xampp\\htdocs\\LESSONS\\Aranan Programci Olma\\java\\__FILES__\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\xampp\\htdocs\\LESSONS\\Aranan Programci Olma\\java\\__FILES__\\students.txt", true));
//            writer.newLine();
            writer.write("Ayxan");
            System.out.println("Dosya Yazildi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
