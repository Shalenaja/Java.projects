package java_program_home_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Задание 1.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек 
//может иметь несколько телефонов.

public class program_5_1 {
    
    public static void main(String[] args) {
        HashMap<String, Integer> userTel = new HashMap<String, Integer>();
        userTel.put("Петров", 698524); 
        userTel.put("Смирнов", 965524);
        userTel.put("Сидоров", 212564);

        HashMap<String, List<Integer>> userTelDub = new HashMap<>();
        List<Integer> one = new ArrayList<>();
        one.add(236584);
        one.add(265854);
        List<Integer> two = new ArrayList<>();
        two.add(256454);
        two.add(985644);
        userTelDub.put("Иванов", one);        
        userTelDub.put("Столяров", two);
        
        for (String user : userTel.keySet()) {
            System.out.printf("абонент: " + user + ", " + "номер :" + userTel.get(user) + "\n");
        }
        for (String user : userTelDub.keySet()) {
            System.out.printf("абонент: " + user + ", " + "номера :" + userTelDub.get(user) + "\n");
        }       
    }  
}
