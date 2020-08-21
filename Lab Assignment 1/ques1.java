import java.util.Scanner;
public class ques1
{
	public static void main(String[] args)
	{
		System.out.println("Enter string 1:");
		Scanner scan= new Scanner(System.in);
		String s1,s2;
		s1=scan.nextLine();
		
		System.out.println("Enter string 2:");
		s2=scan.next();
		int l1=s1.length();
		int l2=s2.length();
		int z=0,ans=0;
		if(l1<l2)
		System.out.println("0");
		else {
			int [] x;
			int [] y;
			x= new int[500];
			y=new int[500];
			for (int i=0;i<l2;i++)
				 y[(int)s2.charAt(i)]++;
			for(int i=0;i<l2;i++){

		          int k=(int)s1.charAt(i);
		          if(x[k]<y[k])
		            z++;
		          x[k]++;

		          if(z==l2)
		            ans++;}

		          for(int i=l2;i<l1;i++){

		          int k=(int)s1.charAt(i);
		        int p=(int)s1.charAt(i-l2);

		        if(x[p]<=y[p])
		        z--;

		        x[p]--;

		        if(x[k]<y[k])
		        z++;

		        x[k]++;

		        if(z==l2)
		        ans++;}

		        System.out.println(ans);		
		}
			
	}
}
