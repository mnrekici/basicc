package hafta3_patika_practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ClosestTwoNumbers {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(32);
        numbers.add(7);
        numbers.add(89);
        numbers.add(17);
        numbers.add(45);
        numbers.add(9);
        numbers.add(54);
        numbers.add(34);
        numbers.add(73);
        numbers.add(28);

        Collections.sort(numbers);

        int minDifference = Integer.MAX_VALUE;
        int closestNum1 = 0;
        int closestNum2 = 0;

        for(int i=0; i<numbers.size()-1; i++){
            int difference = numbers.get(i+1)-numbers.get(i);

            if(difference<minDifference){
                minDifference = difference;
                closestNum1=numbers.get(i);
                closestNum2=numbers.get(i+1);
            }
        }

        // Print the result
        System.out.println("The two closest numbers are: " + closestNum1 + " and " + closestNum2);
        System.out.println("Their difference is: " + minDifference);

    }
}