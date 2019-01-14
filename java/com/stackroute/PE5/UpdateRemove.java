/*Write a Java program to update specific array element
by given element and empty the array list .
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []*/


package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UpdateRemove{
    //method to update specific element in the array//
    public List<String> editlist(List<String> inputString, String keyword) {
        if (inputString!=null) {
            List<String> string = new ArrayList<>();
            for (int i = 0; i < inputString.size(); i++) {
                if (inputString.get(i).contains(keyword)) {
                    inputString.set(i, "kiwi");
                } else if (inputString.get(i).contains("melon")) {
                    inputString.set(i, "mango");
                }
            }
            return inputString;
        }
        return null;
    }
    //method to empty the array//
    public List<String> toEmptyArrayList(List<String> inputString) {
        inputString.clear();
        return inputString;
    }
}