package java_program_home_6;

import java.util.ArrayList; 
import java.util.HashSet; 
import java.util.List;


public class notebook {     
    String producer; 
    String model;  
    int ram;    
    String color;         
    String price;
    String price_gradation;
    String operating_system;
    Boolean ultrabook;     
    int id;   
    Boolean a = true;
    Boolean b = false;      
    
    public notebook(String producer,
        String model,
        int ram,
        String color,        
        String price,
        String price_gradation,
        String operating_system,
        Boolean ultrabook,
        int id) {
                
        this.producer = producer;
        this.model = model;
        this.ram = ram;
        this.color = color;
        this.price = price;
        this.price_gradation = price_gradation;
        this.operating_system = operating_system;        
        this.ultrabook = ultrabook;
        this.id = id;

    }      
        
    public String printNotebook() {
        return "producer: " + producer + ", " + "model: " + model + ", " + "ram: " + ram + "ГБ, " + "operating_system: " + operating_system + ", " + "price: " + price + " рублей";
    }      
          
    public List<notebook> findNotebook_producer(HashSet<notebook> hashNotebook, String str) {
        String producer = str.toLowerCase();       
        List<notebook> notebookList = new ArrayList<notebook>();
        for (notebook notebook : hashNotebook) 
            if (notebook.producer.equals(producer)) {
                notebookList.add(notebook);
            }          
        if (notebookList.isEmpty()) {
            System.out.println("Производитель не найден");
        } 
        return notebookList;       
    }
    public List<notebook> findNotebook_ram(HashSet<notebook> hashNotebook, Integer r) {
        List<notebook> notebookList = new ArrayList<notebook>();
        for (notebook notebook : hashNotebook) 
            if (notebook.ram == r) {
                notebookList.add(notebook);
            }          
        if (notebookList.isEmpty()) { 
            System.out.println("Позиции с таким значением RAM не найдены");
        }              
        return notebookList;
    }
    public List<notebook> findNotebook_color(HashSet<notebook> hashNotebook, String str) {
        String color = str.toLowerCase();      
        List<notebook> notebookList = new ArrayList<notebook>();
        for (notebook notebook : hashNotebook) 
            if (notebook.color.equals(color)) {
                notebookList.add(notebook);
            }          
        if (notebookList.isEmpty()) {           
            System.out.println("Позиции с таким цветом не найдены");
        }
        return notebookList;
    }
    public List<notebook> findNotebook_price(HashSet<notebook> hashNotebook, String gradation) {
        List<notebook> notebookList = new ArrayList<notebook>();
        for (notebook notebook : hashNotebook)
            if (notebook.price_gradation.equals(gradation)) {
                notebookList.add(notebook);
            }
        if (notebookList.isEmpty()) {           
            System.out.println("Категория указана неверно");   
        }
        return notebookList;
    }
}


