package com.everybodycodes.flashk.day01;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class BattleFarmlands {

    private static final char NO_MONSTER = 'x';

    private String monsters;

    private Map<Character,Integer> potionsPerMonster = new HashMap<>();

    public BattleFarmlands(String input) {
        this.monsters = input;
        potionsPerMonster.put('A', 0);
        potionsPerMonster.put('B', 1);
        potionsPerMonster.put('C', 3);
        potionsPerMonster.put('D', 5);
    }

    public long solveA() {
        return StringUtils.countMatches(monsters, "B") + StringUtils.countMatches(monsters, "C")* 3L;
    }

    public long solveB() {

        long result = 0;

        char[] monstersByLetter = monsters.toCharArray();

        int i = 1;
        while(i < monstersByLetter.length) {

            char monster1 = monstersByLetter[i-1];
            char monster2 = monstersByLetter[i];

            if(monster1 == NO_MONSTER || monster2 == NO_MONSTER) {
               // single fight
                result += potionsPerMonster.getOrDefault(monster1, 0) + potionsPerMonster.getOrDefault(monster2, 0);
            } else {
                result += potionsPerMonster.get(monster1) + potionsPerMonster.get(monster2) + 2;
            }

            i += 2;
        }

        return result;

    }

    public long solveC() {

        long result = 0;

        char[] monstersByLetter = monsters.toCharArray();

        int i = 2;
        while(i < monstersByLetter.length) {

            char monster1 = monstersByLetter[i-2];
            char monster2 = monstersByLetter[i-1];
            char monster3 = monstersByLetter[i];

            int monsters = 0;
            if(monster1 != NO_MONSTER) {
                monsters++;
            }

            if(monster2 != NO_MONSTER) {
                monsters++;
            }

            if(monster3 != NO_MONSTER) {
                monsters++;
            }

            int additionalPotions = 0;
            if(monsters == 2){
                additionalPotions = 2;
            } else if(monsters == 3) {
                additionalPotions = 6;
            }

            result += potionsPerMonster.getOrDefault(monster1, 0);
            result += potionsPerMonster.getOrDefault(monster2, 0);
            result += potionsPerMonster.getOrDefault(monster3, 0);
            result += additionalPotions;

            i += 3;
        }

        return result;

    }
}
