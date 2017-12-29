import java.util.List;


public class ReadFile {

    public static void main(String[] args) {
        String fname = System.getProperty("user.home") + "/nabor_slov.txt";
        Count c = new Count(fname);
        List<String> result = c.getResult();
        for (String wordRes : result) {
            System.out.println(wordRes);
        }


    }
}