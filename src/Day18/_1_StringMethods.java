package Day18;

import java.util.Arrays;

public class _1_StringMethods {

    public static void main(String[] args) {


        String str = "Techno Study";
        String str2 = "Batch Six";

        String [] arr = str.split(str2);

        System.out.println(Arrays.toString(arr));
    }
}
