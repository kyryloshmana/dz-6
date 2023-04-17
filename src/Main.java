import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] data = new String[]{  "tata","mama", "qwert","papa", "kaka", "qweqwe"};
        System.out.println(uniqueWorlds(data));
    }
    public static List<Character> uniqueWorlds (String[] data){

        List <String> worldsList = new ArrayList<>();


        for (String word : data){

            char[] getLetters = word.toCharArray();

            Map<Character, Integer> saveLetters = new HashMap<>();

            for(Character later: getLetters){
                if (saveLetters.containsKey(later)){
                    Integer value = saveLetters.get(later)+1;
                    saveLetters.put(later, value);
                }
                else {
                    saveLetters.put(later, 1);
                }
            }
            boolean helper = true;
            for (Character key: saveLetters.keySet()){
                if(saveLetters.get(key) %2 != 0){
                    helper = false;
                }
            }
            if(helper && worldsList.size() < 2){
                worldsList.add(word);
            }

        }
        HashSet <Character> unikLaters = new LinkedHashSet<>();

        for (String unikWorld: worldsList ){
            for (int i = 0; i<unikWorld.length(); i++ ){
                unikLaters.add(unikWorld.charAt(i));

            }
        }

        return new ArrayList<>(unikLaters);

    }
}
