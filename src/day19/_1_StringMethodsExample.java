package day19;

import java.awt.*;
import java.util.Arrays;

public class _1_StringMethodsExample {

    public static void main(String[] args) {

        String word = " We recap string methods on day 19! ";
        String word2 = " we recap string methods on day 19! ";
        String str = "!!";
        Point point = new Point(1,1);

        System.out.println("The word starts with letter 'W': " + word.startsWith("W"));
        System.out.println("The sentence end with '9': " + word.endsWith("9"));
        System.out.println("The lower cased version of the sentence: " + word.toLowerCase());
        System.out.println("The upper cased version: " + word.toUpperCase());
        System.out.println("The length of the sentence: " + word.length());
        System.out.println("The index of the first 'e':  " + word.indexOf('e'));
        System.out.println("The index of the last 'e': " + word.lastIndexOf('e'));
        System.out.println("The char at index '10': " + word.charAt(10));
        System.out.println("The sentence is empty? " + word.isEmpty());
        System.out.println("The sentence contains 'recap': " + word.contains("recap"));
        System.out.println("The concatted version: " + word.concat(str));
        System.out.println("Substring from index '9': " + word.substring(9));
        System.out.println("Substring between index 9 to 24: " + word.substring(9, 24)); // the index 24 is not included
        System.out.println("'!' is replaced by '.': " + word.replace('!', '.'));
        System.out.println("all the characters replaced with '*': " + word.replaceAll("[A-z]", "*"));
        System.out.println("all the numbers replaced with '*': " + word.replaceAll("[0-9]", "*"));
        System.out.println("removed spaces from the beginning and end: " + word.trim());
        System.out.println("word and word2 are equal: " + word.equals(word2));
        System.out.println("word and word2 are equal if we ignore the case: " + word.equalsIgnoreCase(word2));
        System.out.println("the point object: " + point);
        System.out.println("the point object converted to a string: " + point.toString().contains("1"));
        String [] arr = word.trim().split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("the length of the array: " + arr.length);

    }
}
