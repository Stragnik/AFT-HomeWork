import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Analyser {

    public static ArrayList<String> prepare(String content){
        // удаляем все лишнее
        content = content.replaceAll("[^А-яЁёA-z0-9]+", " ");
        String[] words = content.split(" ", -1);
        ArrayList<String> wordList = new ArrayList<>();

        for (int index = 0; index < words.length; index++){
            if (!words[index].equals(""))wordList.add(words[index]);
        }
        return wordList;
    }

    public static void analyse(ArrayList<String> words){
        HashMap<String, Integer> wordsCount = new HashMap<>();
        String mostPopularWord = null;

        for (String word: words){
            word = word.toLowerCase();
            if (wordsCount.containsKey(word)){
                wordsCount.put(word, wordsCount.get(word) + 1);
            }else{
                if(mostPopularWord == null)mostPopularWord = word;
                wordsCount.put(word, 1);
            }
            if(wordsCount.get(word) > wordsCount.get(mostPopularWord)) mostPopularWord = word;
        }

        String[] sortedArray = wordsCount.keySet().toArray(new String[0]);
        Arrays.sort(sortedArray);

        System.out.println("Самое популярное слово - " + mostPopularWord + "\nОно повторяется " + wordsCount.get(mostPopularWord) + " раз(а)\n");
        for (int index = 0; index < sortedArray.length; index++){
            System.out.print(sortedArray[index] + "(" + wordsCount.get(sortedArray[index]) + ") " );
            if ((index+1) % 10 == 0) System.out.println();
        }
    }
}