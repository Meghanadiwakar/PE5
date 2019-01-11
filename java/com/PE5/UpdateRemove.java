package com.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class UpdateRemove{
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
    public List<String> toEmptyArrayList(List<String> inputString) {
        inputString.clear();
        return inputString;
    }
}