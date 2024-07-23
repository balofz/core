package com.jt2024.ioc;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 4};

        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(numbers);

        sorter = new Sorter(new QuickSortStrategy());
        sorter.sort(numbers);
    }
}
