import java.util.Scanner;

public class q1 {

    static void comp(String a1, String a2) {
        int n1 = a1.length();
        int n2 = a2.length();
        char[] s1 = a1.toCharArray();
        char[] s2 = a2.toCharArray();
        int flag = 0;
        for(int i=0;i<n1 && i<n2;i++) {
            if(s1[i]<s2[i]) 
            {
                flag=-1;
                break;
            }
            if(s1[i]>s2[i]) 
            {
                flag=1;
                break;
            }
        }
        if(flag==-1) 
        {
            System.out.println(a1+" < "+a2);
        }
        else if(flag==1) {
            System.out.println(a2+" < "+a1);
        }
        else {
            if(n1>n2) {
                System.out.println(a2+" < "+a1);
            }
            else if(n2>n1) {
                System.out.println(a1+" < "+a2);
            }
            else {
                System.out.println(a1+" = "+a2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to be compared ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        comp(s1,s2);
    }
}