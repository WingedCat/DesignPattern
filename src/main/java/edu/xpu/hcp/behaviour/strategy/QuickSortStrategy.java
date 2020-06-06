package edu.xpu.hcp.behaviour.strategy;

import java.util.Arrays;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("Quick sort...");
        Arrays.sort(array);
    }
}
