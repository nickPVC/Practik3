﻿package task1_app;

/*
1. Создайте текстовый файл, содержащий значения целочисленного массива.
Используя класс Scanner, загрузить значения элементов массива в память.
2. Разместить в начале массива все элементы меньше 0
*/

import java.io.File;
import java.io.FileNotFoundException;
// import java.util.Arrays;
import java.util.Scanner;
// import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arrayInt;
        arrayInt = new int [20];
        int maxLenght=0, sum;
        int i,j,tempValue=0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/in.txt"));
            maxLenght=scanner.nextInt(); // первым числом в файле - кол-во элементов массива
            for (i=0;i<maxLenght;i++){
                arrayInt[i]=scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Output array:");
        for (i=0; i<maxLenght; i++){
            System.out.print(arrayInt[i] + " ");
        }
        // отсортируем массив по взрастанию
        // Arrays.sort(arrayInt);

        for(i = maxLenght-1 ; i > 0 ; i--){
            for(j = 0 ; j < i ; j++){
            /* Сравниваем элементы попарно, если они имеют
                неправильный порядок, то меняем местами */
                if( arrayInt[j+1] < 0 ){
                    tempValue = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = tempValue;

                }
            }
        }
        System.out.println("Output sorted array:");
        for (i=0; i<maxLenght; i++){
            System.out.print(arrayInt[i] + " ");
        }
        /*
         Отредактировать созданную программу и дополнить её новым
         функционалом, заключающимся в размещении в конце массива всех
         элементов больше 10
        */
        for(i = 0 ; i < maxLenght ; i++){
            for(j = i ; j < maxLenght-1 ; j++){
            /* Сравниваем элементы попарно, если они имеют
                неправильный порядок, то меняем местами */
                if( arrayInt[j] > 10 ){
                    tempValue = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = tempValue;
                }
            }
        }
        System.out.println("Output sorted array:");
        for (i=0; i<maxLenght; i++){
            System.out.print(arrayInt[i] + " ");
        }

/*
 Дополнить созданную программу в п.1-2, 4 упорядочиванием по возрастанию
всех элементов, размещённых вначале массива и меньших 0 по возрастанию,
а элементов, размещённых в конце массива и больших 10 – по убыванию.
Элементы со значениями от 0 до 10 оставить без упорядочения
 */


        System.out.println("Output sorted array:");
        for (i=0; i<maxLenght; i++){
            System.out.print(arrayInt[i] + " ");
        }

    }
}
