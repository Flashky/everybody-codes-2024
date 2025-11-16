package com.everybodycodes.flashk.quest02;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RunesOfPowerScaleArmour {

    private List<String> words;
    private final char[][] armour;


    public RunesOfPowerScaleArmour(List<String> inputs) {
        String[] inputWords = inputs.get(0).split(":")[1].split(",");

        // Words. Words can be inverted
        words = Arrays.stream(inputWords).collect(Collectors.toList());
        words.addAll(words.stream().map(StringUtils::reverse).toList());

        inputs.remove(0);
        inputs.remove(0);

        armour = new char[inputs.size()][];
        int i = 0;
        for(String input : inputs) {
            armour[i++] = input.toCharArray();
        }


    }

    public long solve() {

        // TODO Idea principal
        // Vamos a modificar todo este algoritmo y hacerlo desde 0.
        // 1. foreach word
        // 2. Buscar horizontalmente word. hay que aplicar módulo.
        // 3. Si match, guardar en un array de resultados un 1 en las posiciones que hay palabra.
        // 4. Buscar verticalmente word (pensar como).



        long result = 0;
        int[][] results = new int[armour.length][armour[0].length];

        // Find horizontally
        for(String word : words) {
            for (int row = 0; row < armour.length; row++) {
                findRunesHorizontal(results[row], armour[row], word);
            }
        }

        // Traspose for finding vertical
        int[][] trasposedResults = new int[armour[0].length][armour.length];
        char[][] trasposedArmour = new char[armour[0].length][armour.length];
        for(int i = 0; i < results.length; i++) {
            for(int j = 0; j < results[0].length; j++) {
                trasposedResults[j][i] = results[i][j];
                trasposedArmour[j][i] = armour[i][j];
            }
        }

        for(String word : words) {
            for (int row = 0; row < trasposedArmour.length; row++) {
                findRunesVertical(trasposedResults[row], trasposedArmour[row], word);
            }
        }

        for(int i = 0; i < trasposedArmour.length; i++) {
            result +=  Arrays.stream(trasposedResults[i]).sum();
        }

        return result;
    }


    private void findRunesHorizontal(int[] results, char[] armorLine, String word) {

        int armorLineLength = armorLine.length;
        char[] runes = word.toCharArray();

        for(int i = 0; i < armorLine.length; i++) {

            // Search match word
            int[] runeIndexes = new int[runes.length];

            int j = 0;
            boolean isMatch = true;
            while( j < runes.length && isMatch) {
                int runeIndex = (i + j) % armorLineLength;
                if (runes[j] == armorLine[runeIndex]) {
                    runeIndexes[j] = runeIndex;
                } else {
                    isMatch = false;
                }
                j++;
            }

            // Found word
            if(isMatch) {
                for(int runeIndex : runeIndexes) {
                    results[runeIndex] = 1;
                }
            }

        }
    }

    private void findRunesVertical(int[] results, char[] armorLine, String word) {

        int armorLineLength = armorLine.length;
        char[] runes = word.toCharArray();

        for(int i = 0; i < armorLine.length; i++) {

            // Search match word
            int[] runeIndexes = new int[runes.length];

            int j = 0;
            boolean isMatch = true;
            while( j < runes.length && isMatch) {
                if (runes[j] == armorLine[j]) {
                    runeIndexes[j] = j;
                } else {
                    isMatch = false;
                }
                j++;
            }

            // Found word
            if(isMatch) {
                for(int runeIndex : runeIndexes) {
                    results[runeIndex] = 1;
                }
            }

        }
    }

}
