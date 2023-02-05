import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class test3 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(10);
    Random random = new Random();
    for (Integer i =0; i < 10; i++) {
        list.add(random.nextInt(1, 10));}
                
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
