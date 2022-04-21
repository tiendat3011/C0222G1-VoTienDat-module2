package _16_io_text_file.exercise.read_file_csv;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainCountry {
    public static List<Country> countryList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        List<String[]> stringList = Read.readFile("Module2\\src\\_16_io_text_file\\exercise\\read_file_csv\\countries.csv");
        for (String[] item : stringList
        ) {
       Country country = new Country(Integer.parseInt(item[0]),item[1],item[2]);
       countryList.add(country);
        }
        for ( Country item : countryList
             ) {
            System.out.println(item.toString());

        }
    }
}
