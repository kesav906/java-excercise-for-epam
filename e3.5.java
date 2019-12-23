import java.util.*;
import java.io.*;
public class e3.5
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.println("first highest"+a[n-1]);
	    System.out.println("second highest"+a[n-2]);
	}
}
