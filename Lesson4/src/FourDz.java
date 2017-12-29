import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FourDz {
    public static void main(String[] args) {
        Scanner cliScanner = new Scanner(System.in);
        System.out.println("Введите адрес файла: ");
        StringBuffer content = new StringBuffer();

        while (content.length() == 0){
            String filepath = cliScanner.nextLine();
            try{
                Scanner fileScanner = new Scanner(new File(filepath));
                while (fileScanner.hasNext()){
                    content.append(fileScanner.nextLine() + " ");
                }
            }catch (IOException e){
                System.out.println("Ошибка! Не удалось прочесть файл или он пустой, попробуйте снова.");
            }
        }

        ArrayList<String> words = Analyser.prepare(new String(content));
        System.out.println("Результат анализа ниже:\n");
        Analyser.analyse(words);
    }
}