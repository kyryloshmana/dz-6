import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Integer [] digitals = new Integer[]{1,2,4,5};//6
        sumPairedValue(digitals);
    }

    public static void sumPairedValue(Integer[] digitals){
        List<Integer> pairedData = new ArrayList<>();
        for (Integer value:digitals){
            if(value %2 == 0){
                pairedData.add(value);
            }
        }
        int sum = pairedData.stream().mapToInt(Integer::intValue).sum();

        int sum2=0;
        for (int i : pairedData) {
            sum2 +=i;
        }
        System.out.println(sum2);
        System.out.println(sum);


    }

}
