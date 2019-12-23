import java.util.*;
import java.io.*;
public class e3.4
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    char c;
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        c=(char)a[i];
	        System.out.println(a[i]+"= "+c);
	    }
	    
	}
}
