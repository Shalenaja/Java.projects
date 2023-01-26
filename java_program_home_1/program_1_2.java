// Задание 2. Вывести все простые числа от 1 до 1000

import java.util.ArrayList;

public class program_1_2 {
    public static void main(String[] args) {       
        ArrayList arrayList = new ArrayList();
       
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;               
                }                
            }                 
            if (isPrime) {                              
                arrayList.add(i);                       
            }                    
        }
    System.out.println(arrayList);         
    }
}