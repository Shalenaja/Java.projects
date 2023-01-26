// Задание 1. Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n

import java.util.Scanner;

public class program_1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число:\n");
        int n = iScanner.nextInt();        
        iScanner.close();

        int sum = 0;
        int mul = 1;
        int i = 1;
        while (i <= n) {
           sum += i;
           mul *= i;
           i +=1;
        }
        System.out.printf("%d, %d \n", sum, mul);
    }
  }
