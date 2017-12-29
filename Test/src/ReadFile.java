import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        File file = new File("nabor_slov.txt");
        List<String> strings = new ArrayList<String>();
        Scanner sc;

        try {

            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                //.trim() осуществляет обрезание пробелов
                strings.add(line)
                System.out.println(line); //печать строки в стандартный вывод
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            sc.close();
        }

        String []stringsArray = (String []) strings.toArray();
    }
}