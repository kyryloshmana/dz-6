import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String data = "eqw342wercxz";
        getUnikData(data);
    }
    public static void getUnikData(String data){
        Set<Character> getLetter = new HashSet<>();
        for(int i = 0; i<data.length(); i++){
            getLetter.add(data.charAt(i));

        }
        List<Character> helperList = new ArrayList<>(getLetter);

        for (Character character : helperList) {
            System.out.print(character + "\n");

        }



    }
}
