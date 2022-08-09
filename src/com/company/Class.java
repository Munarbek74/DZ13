package com.company;

import java.util.Arrays;

public class Class {
    private int number;
    private String word;
    private int[] array;

    public Class (int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
        System.out.println("number: " + number + "\nword: " + word  + "\narray: " +Arrays.toString(array));
    }


}
