package org.example;

import java.util.ArrayList;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 160; i < 242; i++) {
            charList.add(String.valueOf((char) i));
            if (i == 175) {
                i += 49;
            } else if (i == 239) {
                i += 2;
            }
        }
        System.out.println("Generated charList: " + String.valueOf(charList));
        return charList;
    }
}
