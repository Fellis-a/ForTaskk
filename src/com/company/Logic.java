package com.company;

public class Logic {

    static class Result {
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

        if (array[0] < array[1]) {
            min1 = 0;
            min2 = 1;
            max1 = 1;
            max2 = 0;
        } else {
            min1 = 1;
            min2 = 0;
            max1 = 0;
            max2 = 1;
        }


        for (int i = 2; i < array.length; i++) {
            if (array[i] < array[min1]) {//если текущий эл массива меньше первого минимального
                buff = min1;//запоминаем его, чтобы дальше проверить
                min1 = i;//
                if (array[buff] < array[min2]) {
                    min2 = buff;
                }

            } else if (array[i] < array[min2]) {
                min2 = i;
            }

        }
        for (int i = 2; i < array.length; i++) {
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

        return new Result(array[min1], array[min2], array[max1], array[max2]);
    }
    /*public static String ToString(int a, int b, int c, int d){
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String str3 = Integer.toString(c);
        String str4 = Integer.toString(d);

        String strFirst = str1.concat(str2);



        return str;
    }*/
}