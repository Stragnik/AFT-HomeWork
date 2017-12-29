import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Count {
    private String filePath;
    private ArrayList<String> arrayList;
    private Set<String> arraySet;
    public Count (String str){
        filePath = str;
        arrayList = new ArrayList<>();
        arraySet = new LinkedHashSet<>();
        String inputStr = "";
        int i;
        try (FileInputStream fin = new FileInputStream(new File(filePath))) {
            do {
                i = fin.read();
                if (i != -1) inputStr += ((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] splitStr = inputStr.split("\\s+");
        for (String s : splitStr){
            arrayList.add(s);
        }
    }


    public List<String> getResult() {
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++){
            arraySet.add(arrayList.get(i) + " " + Collections.frequency(arrayList, arrayList.get(i)));
        }

        return new ArrayList<>(arraySet);
    }
}

