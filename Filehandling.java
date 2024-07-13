import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Filehandling {
    public static void main(String args[]) {
        // we want to read from the file and write into the file
        // how to do this ??
        // using BufferedReader class
        String line = "";
        int age = 0;

        Scanner sc = new Scanner(System.in);
        try {
            // Set append mode to true
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            System.out.println("Enter the string");
            line = sc.nextLine();

            System.out.println("What is your age?");
            age = sc.nextInt();

            writer.write("\n"+line);
            writer.write("\nI am " + age + " years old\n");

            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Code to read from the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String readLine;
            while ((readLine = reader.readLine()) != null) {
                System.out.println(readLine);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
