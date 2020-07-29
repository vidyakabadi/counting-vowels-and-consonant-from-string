import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String up=s.toUpperCase();
	    int v=0,c1=0;
	    System.out.println(s.length());
	    for(int i=0;i<s.length();i++)
	    {
	        char c=up.charAt(i);
	        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
	        {
	            v=v+1;
	        }
	        else if(c!=' ' && c>65 && c<90 ){
	            c1=c1+1;
	        }
	        
	    }
		System.out.println("vowel count is"+v);
		System.out.println("consonant count is"+c1);
		
	}
}
