// Задание 2:
// Создать список целых чисел (заполнить случайными числами).
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class program_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random random = new Random();
        for (Integer i =0; i < 10; i++) {
            list.add(random.nextInt(1, 10));}
            
        System.out.println(list);
        MinMaxMid(list);
    }

    public static void MinMaxMid(ArrayList<Integer> list1) {
        int size = list1.size(); 
        int min = list1.get(0);
        int max = list1.get(0);
        int sum =0;
        for (Integer i: list1) {       
            if(i < min)
                min = i; 
            if (i > max) 
                max = i;
        sum += i;       
        } 
        int mid = sum / size;                               
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max );
        System.out.println("Среднее: " + mid );
    }             
}