public class practice_2 {
    public static void main(String[] args) {
    var s = System.currentTimeMillis();
    //String str = "";
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1_000_000; i++) {
    //str += "+";
    sb.append("+");
    }
    System.out.println(System.currentTimeMillis() - s);
    //System.out.println(str);
    //System.out.println(sb);
    }
   }
   
//Напишите метод, который сжимает строку. 
//Пример: вход aaaabbbcdd.
public class practice_2 {
    public static void main(String[] args) {
        String str = "aaaabbbbccddddw";
        int count = 1;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                
            } else {
                newStr.append(str.charAt(i));
                newStr.append(count);
                count = 1;
            }
        }
        newStr.append(str.charAt(str.length()-1));
        newStr.append(count);
        System.out.print(newStr);
    }
}

