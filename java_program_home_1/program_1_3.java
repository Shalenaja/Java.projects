// Задание 3. Реализовать простой калькулятор (операции + - / * )
// Пример работы программы:
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: +
// Ответ: 5
// Введите число 1: 2
// Введите число 2: 3
// Введите операцию: а
// Ответ: Такой операции нет

import java.io.IOException;
import java.util.Scanner;

public class program_1_3 {
    public static void main(String[] args) throws IOException  {
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf("введите первое число:\n");
        int n = iScanner1.nextInt();  
        
        Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("введите второе число:\n");
        int m = iScanner2.nextInt();  

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите требуемую операцию(+, -, *, -):\n");
        char c = (char)System.in.read();
        iScanner.close();
        iScanner1.close();
        iScanner2.close();

        int res;  
        if (c == '+'){
            res = n + m;
            System.out.printf("%d + %d = %d \n", n, m, res);}
        else if (c == '-'){
            res = n - m;
            System.out.printf("%d - %d = %d \n", n, m, res);}
        else if (c == '*'){
            res = n * m;
            System.out.printf("%d * %d = %d \n", n, m, res);}
        else if (c == '/'){
            res = n / m;
            System.out.printf("%d / %d = %d \n", n, m, res);}
        else {
            System.out.printf("Такой операции нет!\n");
        }       
        }                     
}
