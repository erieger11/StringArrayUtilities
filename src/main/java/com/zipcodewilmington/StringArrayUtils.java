package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String i : array)
            if(i.equals(value)) {
                return true;
            }return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       ArrayList<String> reversedArray = new ArrayList<>();
       for (int i = array.length -1; i >= 0; i--) {
            reversedArray.add(array[i]);
       }
       return reversedArray.toArray(new String[0]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        ArrayList<String> reversedArray = new ArrayList<>();

        for (int i = array.length -1; i >= 0; i--) {

            reversedArray.add(array[i]);
        }
        String[] finalReversedArray =  reversedArray.toArray(new String[0]);

        return Arrays.equals(array, finalReversedArray);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        ArrayList<String> pangramic = new ArrayList<>(Arrays.asList(array));
        int letters = 0;
        for (int i = 0; i < pangramic.size(); i++) {
            if(pangramic.get(i).equals('a')){
                letters ++;
            }
        }



        return letters >= 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numberOfOcc = 0;
        for(String i : array)
            if(i.equals(value)) {
                numberOfOcc ++;
            }
        return numberOfOcc;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> remmovedList = new ArrayList<>(Arrays.asList(array));
        remmovedList.remove(valueToRemove);
        return remmovedList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> removedDuplicates = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < removedDuplicates.size()-1; i++) {
            if (removedDuplicates.get(i).equals(removedDuplicates.get(i + 1))) {
                removedDuplicates.remove(i);
                i -- ;
            }
        } return removedDuplicates.toArray(new String[0]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        List<String> addingDuplicates = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < addingDuplicates.size()-1; i++) {
            if (addingDuplicates.get(i).charAt(0) == addingDuplicates.get(i + 1).charAt(0)){
                addingDuplicates.set(i,addingDuplicates.get(i) + addingDuplicates.get(i + 1));
                addingDuplicates.remove(i+1);
                i --;
            }
        }
        return addingDuplicates.toArray(new String[0]);
    }





}
