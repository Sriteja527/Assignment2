import java.util.*;
public class Duplicate {  
Scanner sc = new Scanner(System.in);
void input()
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();  
        int arr[] = new int [n];
for(int i=0;i<n;i++)
{
        arr[i] = sc.nextInt();
}  
System.out.println("The Duplicate elements are: ");
        for(int i = 0; i < n; i++) {  
            for(int j = i + 1; j < n; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }
}  
   
public static void main(String[] args) {
Duplicate d = new Duplicate();
d.input();
 }  
}  