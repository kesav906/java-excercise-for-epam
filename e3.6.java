import java.util.*;
import java.io.*;
public class e3.6
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
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}
}
