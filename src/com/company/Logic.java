package com.company;

public class Logic {

    public static class Result {//для вывода результата
        public int min1;
        public int min2;
        public int max1;
        public int max2;

        public Result(int min1, int min2, int max1, int max2) {
            this.min1 = min1;
            this.min2 = min2;
            this.max1 = max1;
            this.max2 = max2;
        }
    }

    //найти два наибольших и два наименьших элемента
    public static Result MinMax(int array[]) {
        int buff;
        int min1, min2, max1, max2;

        if (array[0] < array[1]) {//выбор начального значения, распределение индексов, тк максимумов и минимумов 2
            min1 = 0;//если первый элемент меньше
            min2 = 1;
            max1 = 1;
            max2 = 0;
        } else {// в других случаях
            min1 = 1;
            min2 = 0;
            max1 = 0;
            max2 = 1;
        }


        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[min1]) {//если текущий эл массива меньше первого минимального
                buff = min1;//запоминаем его индекс, чтобы дальше проверить
                min1 = i;//индекс первого минимального равен текущему
                if (array[buff] < array[min2]) {//присвоение от первого минимального второму
                    min2 = buff;
                }

            } else if (array[i] < array[min2]) {//текущий элемент меньше второго минимального
                min2 = i;
            }

        }
        for (int i = 2; i < array.length; i++) {//аналогично для максимума
            if (array[i] > array[max1]) {
                buff = max1;
                max1 = i;
                if (array[buff] > array[max2]) {
                    max2 = buff;
                }

            } else if (array[i] > array[max2]) {
                max2 = i;
            }


        }

        return new Result(array[min1], array[min2], array[max1], array[max2]);//
    }

}