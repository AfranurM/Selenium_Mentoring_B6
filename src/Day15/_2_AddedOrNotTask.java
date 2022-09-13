package Day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2_AddedOrNotTask {

    // Task
    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(3);

        Set<Integer> uniqueValues = new HashSet<>();
        List<Integer> duplicatedValues = new ArrayList<>();

        int duplicatedCount = 0;

        for (int i = 0; i < listOfNumbers.size(); i++){
            boolean isAdded = uniqueValues.add(listOfNumbers.get(i));
            if(!isAdded){
                duplicatedCount++;
                duplicatedValues.add(listOfNumbers.get(i));
            }
        }
        System.out.println("Number of values duplicated: " + duplicatedCount);
        System.out.println("Duplicated values: " + duplicatedValues);
    }
}
