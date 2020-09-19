package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(array[i]);
        }//генерируем последовательностьс
        Logic.Result result = Logic.MinMax(array);

        System.out.println("Минимальные числа:");
        System.out.println(result.min1);
        System.out.println(result.min2);
        System.out.println("Максимальные числа:");
        System.out.println(result.max1);
        System.out.println(result.max2);
    }
}
