import java.util.Scanner;

/**
 *  Created by Sergey Smirnov
 */

public class Array {
    private String array[];
    private int arr_length;
    private Scanner scanner = new Scanner(System.in);

    public Array(){
        System.out.println("Задайте длинну массива:");
        setArr_length(scanner.nextInt());
        System.out.println("Введите элементы массива по порядку: ");
        String words[] = new String[arr_length];
        for (int i = 0; i < arr_length; i++){
            words[i] = scanner.next();
        }
        setArray(words);
    }

    public void setArray(String arr[]){
        this.array = new String[arr.length];
        for (int i = 0; i < arr.length; i++){
            this.array[i] = arr[i];
        }
    }
    public String[] getArray() {
        return array;
    }

    public int getArr_length() {
        return arr_length;
    }

    public void setArr_length(int arr_length) {
        this.arr_length = arr_length;
    }

    public String maxLengthWord(){
        String maxWord = this.array[0];
        int max = this.array[0].length();
        for (int i=0; i < getArr_length(); i++){
            if (this.array[i].length() > max) {
                maxWord = this.array[i];
                max = this.array[i].length();
            }
        }
        return maxWord;
    }
}