package Day18;

import java.util.Arrays;

public class _2_ReverseArray {

    public static void main(String[] args) {

        String [] animal = {"dog", "cat", "elephant", "bird"};
        System.out.println("given array: " + Arrays.toString(animal));

        int counter = 0;
        String [] reversedArray = new String[animal.length];

        while (counter<animal.length){
            reversedArray[counter] = animal[(animal.length-1)-counter];
            counter++;
        }

        System.out.println("reversed array: " + Arrays.toString(reversedArray));


////////// Second way //////////////
//        String[] reversedArray = new String[myArray.length];
//        for (int i = 0; i < myArray.length; i++) {
//            reversedArray[myArray.length-1-i] = myArray[i];
//        }
//        System.out.println(Arrays.toString(reversedArray));

/////////////// Third way ///////////////////
//        String[] reversedArray = new String[myArray.length];
//        for (int i = 0, j = myArray.length - 1; i < myArray.length; i++, j--) {
//            reversedArray[j] = myArray[i];
//        }
//        System.out.println(Arrays.toString(reversedArray));

/////////////// Fourth way ////////////////////////
//        int lastIndex = myArray.length - 1;
//        for (int i = 0; i < myArray.length/2; i++) {
//            String temp = myArray[i];
//            myArray[i] = myArray[lastIndex-i];
//            myArray[lastIndex-i] = temp;
//        }
//        System.out.println(Arrays.toString(myArray));
    }
}
