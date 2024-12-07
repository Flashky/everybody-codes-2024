package com.everybodycodes.flashk.day01;

import java.util.HashMap;
import java.util.Map;

public class BattleFarmlands {

    private static final char NO_MONSTER = 'x';

    private final char[] monsters;
    private final Map<Character,Integer> potionsPerMonster = new HashMap<>();
    private final Map<Integer,Integer> additionalPotionsPerMonsterCount = new HashMap<>();

    public BattleFarmlands(String input) {
        this.monsters = input.toCharArray();
        potionsPerMonster.put('A', 0);
        potionsPerMonster.put('B', 1);
        potionsPerMonster.put('C', 3);
        potionsPerMonster.put('D', 5);
        additionalPotionsPerMonsterCount.put(0,0);
        additionalPotionsPerMonsterCount.put(1,0);
        additionalPotionsPerMonsterCount.put(2,2);
        additionalPotionsPerMonsterCount.put(3,6);

    }

    public long solve(int groupSize) {
        long potionCount = 0;
        int i = 0;

        while(i < monsters.length) {

            int monsterCount = 0;
            for(int j = 0; j < groupSize; j++) {
                // Pick a group
                char monster = monsters[i+j];
                if(monster != NO_MONSTER){
                    monsterCount++;
                    potionCount += potionsPerMonster.get(monster);
                }
            }

            potionCount += additionalPotionsPerMonsterCount.get(monsterCount);

            i += groupSize;
        }

        return potionCount;
    }

}
