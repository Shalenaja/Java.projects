

import java.util.LinkedList;


public class test4 {
    private LinkedList elements = new LinkedList();

    public test4() {
    }

    public test4(LinkedList elements) {
        this.elements = elements;
    }

    public void enqueue(Object element) {
        elements.add(element);
    }

    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public Object first() {
        return elements.getFirst();
    }

    public LinkedList getElements() {
        return elements;
    }

    public void setElements(LinkedList elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        test4 queue = new test4();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}    
        