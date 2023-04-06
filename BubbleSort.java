import java.util.*;
public class BubbleSort {
	Scanner sc = new Scanner(System.in);
	void input()
	{
		int temp;
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[] = new int[n]; // 5
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt(); // 10 40 50 30 20
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort b = new BubbleSort();
		b.input();
	}

}