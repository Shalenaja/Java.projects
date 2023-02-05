/**
 * program
 */
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        String s = null;
        float f = 123.45f;
        double d = 123.456d;
        double d2 = 123.45688;
        char ch = ']';
        char ch2 = 123;
        int n = 123;
        n++;
        double db = n;
        String st = "qwer";
        st.charAt(1);
        System.out.println("world");  //text
        System.out.println(s);  //text
        System.out.println(f);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(db);
        System.out.println(n);
        System.out.println(st.charAt(1));
        int a = 123;
        System.out.println(a++);
        System.out.println(a);
        int c = 198;
        System.out.println(++c);
        System.out.println(c);
        int h = 5;
        h = h-- - --h;
        System.out.println(h);
        int h1 = 5;
        h1 = h1++ - ++h1;
        System.out.println(h1);
        boolean g = 333 != 222;
        System.out.println(g);
        int m = 8;   // 1000  =8
        //m = m << 1;
        System.out.println(m << 1); //10000  =16
        int w = 5; // 101
        int v = 2; // 010
        System.out.println(w | v); // 101 или 010   =  111   =7
        System.out.println(w & v); // 101 и 010   =  000   =0
        System.out.println(w ^ v); // 101 разделитель 010   =  111   =7

        String sn = "qwr1";
        boolean bn = sn.length()>= 5 && sn.charAt(4) == '1'; //если левая часть дает false то нет смысла смотреть справа
        System.out.println(bn);
        String snm = "qwr1";
        //boolean bnm = sn.length()>= 5 & snm.charAt(4) == '1';// всмотри условие справа не смотря на то, что слева не выполнено
        //System.out.println(bnm);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();

        int az = 1, bz = 2;
        int cz = az + bz;
        String res = String.format("%d + %d = %d \n", az, bz, cz);
        System.out.printf("%d + %d = %d \n", az, bz, cz);
        System.out.println(res);

    }
    
}