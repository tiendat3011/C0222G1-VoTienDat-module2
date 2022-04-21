package _16_io_text_file.pratice.find_max_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = (List<Integer>) readAndWriteFile.readFile("Module2\\src\\_16_io_text_file\\pratice\\find_max_value\\Number");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("Module2\\src\\_16_io_text_file\\pratice\\find_max_value\\Max", maxValue);
    }
}

