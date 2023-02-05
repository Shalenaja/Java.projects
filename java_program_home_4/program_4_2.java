package java_program_home_4;

// Задание 2:
// Создать очередь с помощью LinkedList и реализовать следующие методы:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Вызвать полученные методы и убедиться в их работоспособности.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class program_4_2 { 
    public static void main(String[] args) {
        LinkedList<Integer> QueueListNew = new LinkedList<>();
        Random random = new Random();
        for (Integer i =0; i < 6; i++) {
            QueueListNew.add(random.nextInt(1, 10));}

        System.out.println("Очередь: " + QueueListNew);

        enqueue(QueueListNew, 23);
        enqueue(QueueListNew, 34);
        enqueue(QueueListNew, 85);
        System.out.println("Очередь с добавлением: " + QueueListNew);
        dequeue(QueueListNew);
        dequeue(QueueListNew);
        System.out.println("После удаления: " + QueueListNew);
        //first(QueueListNew);
        System.out.println("из очереди:" + first(QueueListNew));
    }
    public static Queue<Integer> enqueue(LinkedList<Integer> QueueList, int element) 
    {
        QueueList.add(element);
        return QueueList;
    }

    public static Queue<Integer> dequeue (LinkedList<Integer> QueueList)    
    {    
        QueueList.removeFirst();    
        return QueueList;
    }

    public static Queue<Integer> first(LinkedList<Integer> QueueList) 
    {
        QueueList.getFirst();
        System.out.println("Первый элемент очереди: " + QueueList.getFirst());
        return QueueList;
    }
}