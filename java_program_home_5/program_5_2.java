package java_program_home_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Задание 2.
// Пусть дан список сотрудников:
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Иван Савин
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.

//Иван 4, ...

public class program_5_2 {
    
    public static void main(String[] args) {
        String str = "Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков "
        +"Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Иван Савин Мария Рыкова Марина Лугова "
        +"Анна Владимирова Иван Мечников Петр Петин Иван Ежов";

        HashMap<String, String> person = new HashMap<String, String>();        
        String [] newStr = str.split(" ", str.length());
        int k = 0;
        while (k < newStr.length) {   
            person.put(newStr[k+1], newStr[k]);
        k = k+2;
        } 

        HashMap<String, Integer>beforeSortMap = countIterName(person);
        System.out.println("Список имен с повторениями: " + beforeSortMap);
        LinkedHashMap<String, Integer> SortedMap = sortMap(beforeSortMap);        
        LinkedHashMap<String, Integer> result = reverseMap(SortedMap);    
        System.out.println("Список имен с повторениями в порядке популярности: " + result);
    } 

    static HashMap<String, Integer> countIterName(HashMap<String, String> people) {
        HashMap<String, Integer> IterName = new HashMap<>();       
        int count = 0;
        ArrayList<String> name = new ArrayList<>(people.values());
        name.sort(null);       
        
        for(int i = 0; i < name.size()-1; i++){

            for(int j = 0; j < name.size()-1; j++){                
                if(name.get(j).equals(name.get(j+1)) == true){
                count +=1;                
                IterName.put(name.get(j), count);
                continue;}
                count = 1;
            }
        }
        return IterName;
    }
  
    static LinkedHashMap<String, Integer> sortMap(HashMap<String, Integer> MapBefore) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer>list = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : MapBefore.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);     
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : MapBefore.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        return sortedMap;
    }

    static LinkedHashMap<String, Integer> reverseMap(LinkedHashMap<String, Integer> MapBefore) {
        LinkedHashMap<String, Integer> TurnedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : MapBefore.entrySet()) {
                list.add(entry.getValue());
        }      
        Collections.reverse(list);    
        for (int num : list) {
            for (Map.Entry <String, Integer> entry : MapBefore.entrySet()) {
                if (entry.getValue().equals(num)) {
                    TurnedMap.put(entry.getKey(), num);
                }
            }
        }
        return TurnedMap;
    }   
}
