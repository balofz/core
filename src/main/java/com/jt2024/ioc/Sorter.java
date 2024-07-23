package com.jt2024.ioc;

public class Sorter {
    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] numbers) {
        sortingStrategy.sort(numbers);
    }
}
