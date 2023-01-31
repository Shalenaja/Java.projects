// Задание 1.
// Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;


public class program_3_1 {
         
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);        
        Random random = new Random();
        for (Integer i =0; i < 10; i++) {
            list.add(random.nextInt(1, 10));
        }
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
        DelEvenNumber(list);
    }   
    public static void DelEvenNumber(ArrayList<Integer> list1) {
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            Integer lst = iterator.next();
                if(lst % 2 == 0)
                    iterator.remove();}                                 
        System.out.println(list1); 
    }      
}   
     