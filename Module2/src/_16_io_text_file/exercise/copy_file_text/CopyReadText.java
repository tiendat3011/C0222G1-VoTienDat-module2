package _16_io_text_file.exercise.copy_file_text;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;

public class CopyReadText {

    public static void main(String[] args) {
        try {
            File read = new File("Module2\\src\\_16_io_text_file\\exercise\\copy_file_text\\Readd");
            FileReader fileReader = new FileReader(read);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("lỗi đọc file" + e);
        }
//    }
//
//    public static void Copy(String[] args) {
        try {
            File copy = new File("Module2\\src\\_16_io_text_file\\exercise\\copy_file_text\\Copyy");
            FileWriter fileWriter = new FileWriter(copy);

            fileWriter.write("Võ Tiến Đạt C0222G1");


            fileWriter.close();

        } catch (IOException e) {
            System.out.println("lỗi ghi file " + e);
        }
    }
}
