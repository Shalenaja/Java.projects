// Домашнее задание Семинар 6
//Создать класс Ноутбук для магазина техники.
//Добавить атрибуты класса с соответствующими типами.
// Например,
// - идентификатор
// - производитель
// - название модели
// - RAM
// - объем HD
// - операционная система
// - цена
// - и т.д.
// Добавить конструктор класса.
// Добавить необходимые методы класса.

// Создать множество ноутбуков (множество объектов класса ноутбук).
// 3-10 штук

// Вывести в консоль меню пользователя:
// Добро пожаловать в каталог ноутбуков! 
// Выберите действие:
//   1 - Печать всех товаров
//   2 - Поиск по каталогу
//   0 - Выход
// Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
// Например:

// Введите цифру, соответствующую критерию поиска:
// 1 - RAM
// 2 - Объем HD
// 3 - Операционная система
// 4 - Цвет …

// Пример вывода:

// Ноутбуки с цвет Серебристый
// 1 Honor ...
// 2..
// 3...

package java_program_home_6;

import java.util.HashSet; 
import java.util.List; 
import java.util.Scanner;


public class program_6_1 {
   
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в католог ноутбуков! ");
        System.out.println("Выберите действие: \n 1 -печать всех товаров; \n 2 -поиск по катологу; \n 0 -выход"); 
        Scanner iScanner = new Scanner(System.in, "cp866");
        int userInput = iScanner.nextInt();        

        HashSet<notebook> notebookSet = new HashSet<notebook>();
        notebook notebook_1 = new notebook("asus", " E410MA-BV1516", 4 , "black",
         "25 000", "+", " Windows", false, 21166);
        notebook notebook_2 = new notebook("acer", "Aspire 1 A114-33-P7VD", 8 , "silver",
         "32 000", "++", "Eshell", false, 12345);
        notebook notebook_3 = new notebook("digma", "EVE 15 P417, 15.6", 4 , "black",
         "21 000", "+", "Windows", false, 35684);
        notebook notebook_4 = new notebook("honor", "MagicBook 15", 8 , "grey",
         "48 000", "++", "без операционной системы", true, 12567);
        notebookSet.add(notebook_1);
        notebookSet.add(notebook_2);
        notebookSet.add(notebook_3);
        notebookSet.add(notebook_4);

        switch (userInput) {
            case 1:
                for (notebook notebook : notebookSet) {
                    System.out.println(notebook.printNotebook());
                }
                break;
            case 2:
                System.out.println("Введите цифру, соответствующую критерию поиска: 1(производитель), 2(RAM),"
                + " 3(цвет), 4(цена)");
                String Input = iScanner.next();             
                switch (Input) {
                    case "1":                        
                        System.out.println("Введите производителя :");
                        String prod = iScanner.next();                        
                            List<notebook> queryNotebook_1 = notebook_4.findNotebook_producer(notebookSet, prod);
                            for (notebook notebook : queryNotebook_1) {                               
                                System.out.println(notebook.printNotebook());
                            }              
                        break;  
                    case "2":
                        System.out.println("Введите RAM :");
                        Integer ram = iScanner.nextInt();                        
                            List<notebook> queryNotebook_2 = notebook_4.findNotebook_ram(notebookSet, ram);
                            for (notebook notebook : queryNotebook_2) {                               
                                System.out.println(notebook.printNotebook());
                            }              
                        break;  
                    case "3":
                        System.out.println("Введите цвет :");
                        String color = iScanner.next();                        
                            List<notebook> queryNotebook_3 = notebook_4.findNotebook_color(notebookSet, color);
                            for (notebook notebook : queryNotebook_3) {                               
                                System.out.println(notebook.printNotebook());
                            }              
                        break;  
                    case "4":
                        System.out.println("Введите ценовую категорию: + (до 25 000), ++ (от 25 001 до 50 000): ");
                        String price = iScanner.next();  
                        iScanner.close();
                            List<notebook> queryNotebook_4 = notebook_4.findNotebook_price(notebookSet, price);
                            for (notebook notebook : queryNotebook_4) {
                                System.out.println(notebook.printNotebook());
                            }
                        break;                                          
                        } 
            case 0:        
            System.exit(0);
            break;
        
            default:
            System.out.println("There's no such opeartion...");
            break; 
        }
    }    
}
        