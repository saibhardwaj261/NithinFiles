
public class Arrayeo 
{
	public static void main(String args[])
	{
			int[] arr=new int[]{10,20,30,40,50};
			for(int x=0;x<arr.length;x++)
			{
				System.out.println(arr[x]);
			}
	}

}

class Arrayeo1 
{
	public static void main(String args[])
	{
			int[] arr=new int[]{10,20,30,40,50};
			for(int x=arr.length-1;x>=0;x--)
			{
				System.out.println(arr[x]);
			}
	}

}

class Arrayeo2 
{
	public static void main(String args[])
	{
			int[] arr=new int[]{10,20,30,40,50};
			for(int x=0;x<arr.length;x+=2)
			{
				System.out.println(arr[x]);
			}
	}

}

class Arrayeo3
{
	public static void main(String args[])
	{
			int[] arr=new int[]{10,20,30,40,50};
			for(int x=1;x<arr.length;x+=2)
			{
				System.out.println(arr[x]);
			}
	}

}

class Arrayeo4 
{
	public static void main(String args[])
	{
			int sum=0;
			int[] arr=new int[]{10,20,30,40,50};
			for(int x=0;x<arr.length;x++)
			{
				System.out.println(arr[x]);
				sum=sum+arr[x];
			}
				System.out.println(sum);
				
	}

}
class Arrayeo5 
{
	public static void main(String args[])
	{
			int[] arr=new int[]{10,20,30,40,50};
			for(int x=0;(x<arr.length/2);x++)
			{
				System.out.println(arr[x]);
			}
	}

}