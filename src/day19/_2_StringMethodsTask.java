package day19;

import java.util.Arrays;
import java.util.Scanner;

public class _2_StringMethodsTask {

    // Use scanner class and get the first name from user: firstName

    // Given String is " If your phone number is 111-222-3333, please confirm this message! "
    // Output should be “firstName, your phone number is 111*******”

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yur first name: ");
        String firstName = scanner.nextLine();

        String sentence = " If your phone number is 111-222-3333, please confirm this message! ";
        String substringThePart = sentence.substring(4,37);
        System.out.println(substringThePart);
        String [] splitFromFirstDash = substringThePart.split("-", 2);
        System.out.println(Arrays.toString(splitFromFirstDash));
        System.out.println(splitFromFirstDash[0]);
        String theLastPartReplacedWithStar = splitFromFirstDash[1].replaceAll("[0-9]", "*");
        System.out.println(theLastPartReplacedWithStar);
        System.out.println(firstName + ", " + splitFromFirstDash[0].concat(theLastPartReplacedWithStar.replaceAll("-","")));
    }
}
