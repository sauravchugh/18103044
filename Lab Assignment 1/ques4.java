import java.util.Scanner;
class ques4{
	static boolean areAnagram(String str1, String str2) {
		if (str1.length()!=str2.length()) {
			return false;
		}
		int val=0;
		for (int i=0;i<str1.length();i++) {
			val=val^(int)str1.charAt(i);
			val=val^(int)str2.charAt(i);
			}
		return val==0;	
	}
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string ");
		s1=sc.nextLine();
		System.out.println("Enter 2nd string");
		s2=sc.nextLine();
		boolean answer=areAnagram(s1,s2);
		if(answer==true)
			System.out.println("Anagram strings");
		else
			System.out.println("Strings are not anagrams");
	}
}
