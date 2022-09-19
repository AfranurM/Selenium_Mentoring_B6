package Day16;

import java.util.Arrays;

public class _2_Task {

    // From an int array, return the two number which is equal
    // to target number (example {3,1,6,9,2} target is 15)

    public static void main(String[] args) {

        int[] arr = {3,1,6,9,2};
        int target = 15;

        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }
    public static int [] findTwoSum(int [] arr, int target){

        int[] newArr = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    newArr[0] = arr[i];
                    newArr[1] = arr[j];
                }
            }
        }
        return newArr;
    }
}
