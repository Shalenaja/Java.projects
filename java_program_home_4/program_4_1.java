package java_program_home_4;

// Задание 1.
// Создать LinkedList целых чисел (заполнить случайными числами).
// Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class program_4_1 {
    private static final int LinkedList = 0;

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (Integer i =0; i < 10; i++) {
            list.add(random.nextInt(1, 10));}
            
        System.out.println(list);
        System.out.println(RiverseList(list));
    }    
    public static java.util.LinkedList<Integer> RiverseList(LinkedList<Integer> list1) {        
        
        int s = list1.size()-1;
        for(int i = 0; i-1 < s; i++) {
            int a = (int) list1.get(i);
            list1.set(i, list1.get(s));
            list1.remove(s);
            list1.add(s, a);
            s -=1;
        }
        return list1;    
    }
    public static int getLinkedlist() {
        return LinkedList;
    }  
}
