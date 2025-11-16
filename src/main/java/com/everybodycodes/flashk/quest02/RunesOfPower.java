package com.everybodycodes.flashk.quest02;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class RunesOfPower {

    private List<String> words;
    private List<String> inscriptions;

    public RunesOfPower(List<String> inputs) {
        String[] inputWords = inputs.get(0).split(":")[1].split(",");
        words = Arrays.stream(inputWords).toList();

        inputs.remove(0);
        inputs.remove(0);
        inscriptions = inputs;
    }

    public long solveA() {
        long result = 0;
        for(String word : words) {
            result += StringUtils.countMatches(inscriptions.get(0), word);
        }

        return result;
    }

    public long solveB() {
        long result = 0;

        for(String inscription : inscriptions)  {
            int[] runes = new int[inscription.length()];

            for(String word : words) {
                findRunes(runes, inscription, word);
                findRunes(runes, inscription, StringUtils.reverse(word));
            }

            result += Arrays.stream(runes).filter(r -> r > 0).count();
        }


        return result;
    }



    private void findRunes(int[] runes, String inscription, String word) {

        int index = 0;
        int nextIndex = 0;
        while(index != -1) {
            nextIndex = inscription.indexOf(word, index);
            if(nextIndex == -1) {
                break;
            }

            for(int i = 0; i < word.length(); i++) {
                runes[nextIndex+i] = 1;
            }

            index = nextIndex + word.length();
            if(word.length() > 1){
                index--;
            }

        }

    }

}
