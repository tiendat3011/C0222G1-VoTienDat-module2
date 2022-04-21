package _16_io_text_file.exercise.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Read {
    public static List<String[]> readFile(String parth) throws IOException{
        File file = new File(parth);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]>listStr= new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] arrStr = line.split(",");
                listStr.add(arrStr);
            }
            return listStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }
}
