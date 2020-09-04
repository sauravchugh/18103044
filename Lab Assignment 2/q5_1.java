import java.util.Scanner;
//14 milliseconds

public class q5_1 {
    public static void intersection(int []x, int[] y) {
        int l1=x.length;
        int l2=y.length;
        int flag=1;
        int[] ours=new int[Math.min(l1, l2)];
        int i1=0, i2=0, index=0;
        while(i1<l1 && i2<l2) {
            if (x[i1] == y[i2]) {
                ours[index] = x[i1];
                index++;
                i1++;
                i2++;
                flag = 0;
            }
            else if (x[i1] < y[i2]) {
                i1++;
            }
            else i2++;
        }
        System.out.print("\nIntersection :-");
        if(flag==1)
            System.out.print("NULL");
        else
            for(int i=0; i<index; i++)
                System.out.print(" " + ours[i]);
    }

    public static void union(int []x, int[] y) {
        int l1=x.length;
        int l2=y.length;
        int[] ours=new int[l1+l2];
        int i1=0, i2=0, index=0;
        while(i1<l1 && i2<l2) {
            if(x[i1]==y[i2]) {
                ours[index++]=x[i1++];
                i2++;
            }
            else if(x[i1]<y[i2]) {
                ours[index++]=x[i1++];
            }
            else {
                ours[index++]=y[i2++];
            }
        }
        while(i2<l2) {
            ours[index++] = y[i2++];
        }
        while(i1<l1) {
            ours[index++]=x[i1++];
        }
        System.out.print("\nUnion :-");
        for(int i=0; i<index; i++)
            System.out.print(" " + ours[i]);
    }

    public static void complement(int []x, int []ref) {
        int l1=x.length, index=0;
        int []ours=new int[11];
        int i=0, j=0, flag=1;
        while(index<11 && i<l1) {
            if(x[i]==ref[index]) {
                i++;
                index++;
            }
            else {
                ours[j++]=ref[index++];
                flag=0;
            }
        }
        while(index<11) {
            ours[j++] = ref[index++];
            flag = 0;
        }
        System.out.print("\nComplement :-");
        if(flag==1)
            System.out.print("NULL");
        else
        for(i=0; i<j; i++)
            System.out.print(" " + ours[i]);
    }

    public static int[] finetune(int[] x) {
        int n=x.length;
        int ref[]= new int [11];
        for(int i=0; i<11; i++)
            ref[i]=0;
        for(int i=0; i<n; i++) {
            ref[x[i]]++;
        }
        int index=0;
        for(int i=0; i<11; i++) {
            if(ref[i]!=0) {
                x[index]=i;
                index++;
            }
        }
        int []ours= new int [index];
//      System.arraycopy(ours, 0, x, 0, index);
        for(int i=0; i<index; i++)
            ours[i]=x[i];
        return ours;
    }

    public static void main(String[] args) {
		
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter no. of elements in first set:");
        int l1=obj.nextInt();
        System.out.println("Enter no. of elements in second set:");
        int l2=obj.nextInt(), count=0;
        int ref[]={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int []arr1= new int[l1];
        int []arr2= new int[l2];
        System.out.println("Elements of first set:");
        for(int i=0; i<l1; i++) {
            arr1[i] = obj.nextInt();
            while(arr1[i]<0 || arr1[i]>10) {
                System.out.println("Invalid choice. Enter a number between 0 and 10");
                arr1[i]=obj.nextInt();
            }
        }
        System.out.println("Elements of second set:");
        for(int i=0; i<l2; i++) {
            arr2[i] = obj.nextInt();
            while(arr2[i]<0 || arr2[i]>10) {
                System.out.println("Invalid choice. Enter a number between 0 and 10");
                arr2[i]=obj.nextInt();
            }
        }
		long start = System.currentTimeMillis();
        arr1=finetune(arr1); //sort 
        arr2=finetune(arr2);
        union(arr1, arr2);
        intersection(arr1, arr2);
        complement(arr1, ref);
        complement(arr2, ref);
		long end = System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" milliseconds");
    }
}
