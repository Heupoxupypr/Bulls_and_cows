package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (int i = 61; i < 123; i++) {
            charList.add(String.valueOf(i));
        }
        System.out.println("Generated charList: " + charList);
        return charList;
    }
}
