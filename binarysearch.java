import java.util.*;
class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}		
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the element wants to search");
		int search=sc.nextInt();
		int low=0,high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(search>a[mid])
			{
				low=mid+1;	
				
			}
			else
			if(search<a[mid])
			{
				high=mid-1;
			}
			else
			{
				System.out.println(a[mid]);
				break;
			}
		}
	}
}