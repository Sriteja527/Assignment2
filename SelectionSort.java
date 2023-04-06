import java.util.*;
public class SelectionSort {
	Scanner sc = new Scanner(System.in);
void input()
{
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();  // 40 20 30 10 50
	}
	
	  for (int i = 0; i < n; i++)  
      {  
          int index = i;  
          for (int j = i + 1; j < n; j++){  
              if (arr[j] < arr[index]){  
                  index = j;
              }  
          }  
          int smallerNumber = arr[index];   
          arr[index] = arr[i];  
          arr[i] = smallerNumber;  
      }
	  for(int i=0;i<n;i++)
	  {
		  System.out.println(arr[i]);
	  }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SelectionSort s = new SelectionSort();
s.input();
	}

}
