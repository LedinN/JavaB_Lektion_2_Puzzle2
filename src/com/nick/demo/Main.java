package com.nick.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> puzzle = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            puzzle.add(i+1);
        }
        System.out.println(puzzle);
        Collections.reverse(puzzle);
        System.out.println(puzzle);
        Collections.sort(puzzle);
        System.out.println(puzzle);

    }
}
