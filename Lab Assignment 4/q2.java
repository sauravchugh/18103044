import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int nm = -1;
        byte b = (byte)nm;
        int n = b;
        char c = (char)b, c1 = (char)n;
        int fnm = c;
        System.out.println("Initial int: "+ nm);
        System.out.println("Then Byte: "+ b + " " + n + " " + c1);
        System.out.println("Then Character: "+ c);
        System.out.println("Final int: "+ fnm);
    }
}

