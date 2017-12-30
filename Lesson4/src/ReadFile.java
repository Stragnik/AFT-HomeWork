import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class ReadFile {

    public static void main(String[] args) {
        Scanner scanner = null;

        // Читаем файл
        try {
            scanner = new Scanner(new File("J:\\AFT-HomeWork\\AFT-HomeWork\\Lesson3\\Lesson4\\src\\nabor_slov.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // подсчет слов
        Map<String, Integer> numberOfWords = new TreeMap<>();

        // Хранение повторяющихся слов
        List<String> maxWords = new ArrayList<>();
        Integer maxNumber = 0;

        // Флаг на случай пустого файла
        Boolean fileIsEmpty = true;

        while (scanner.hasNext()) {
            String currentWord = scanner.useDelimiter("\\s+").next();
            fileIsEmpty = false;
            // Количество слов
            Integer countWord = numberOfWords.get(currentWord);
            if (countWord == null) {
                countWord = 0;
            }
            numberOfWords.put(currentWord, ++countWord);

            // Частое слово
            if (maxNumber < countWord) {
                maxNumber = countWord;
                maxWords.clear();
                maxWords.add(currentWord);
            } else if (maxNumber.equals(countWord)) {
                maxWords.add(currentWord);
            }
        }

        if (!fileIsEmpty) {
            System.out.println("Слова и их количество:");
            System.out.println(numberOfWords);
            System.out.printf("Чаще всего, встречается слово/а: %s.\n", maxWords);
            System.out.printf("Повторяется %d раз/а.\n", maxNumber);
        } else {
            System.out.println("Ошибка! Ваш файл, пуст!");
        }

        scanner.close();
    }
}