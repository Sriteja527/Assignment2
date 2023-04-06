import  java.util.Scanner;
public class Quick
{
    int n;
    int a[];
    Scanner in=new Scanner(System.in);
    Quick()
    {
        System.out.println("enter size of array:");
        n=in.nextInt();
        a=new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("The value of the array is:["+(i+1)+"]");
            a[i]=in.nextInt();
        }
    }
     void display()
{
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
    void quick(int left,int right)
    {
        if(right-left<=0)
            return;
        else
        {
            int piv=a[right];
            int pos=partition(left,right,piv);
            quick(left,pos-1);
            quick(pos+1,right);
        }
    }
    int partition(int left,int right,int piv)
    {
        int l=left-1;
        int  r=right;
        while(true)
        {
            while(a[++l]<piv);
            while(r>0&&a[--r]>piv);
            if(l>=r)
                break;
            else
                swap(l,r);
        }
        swap(l,right);
        return l;
    }
    void swap(int l,int r)
    {
        int temp;
        temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }


    public static void main(String args[])
    {
        Quick obj1=new Quick();
        obj1.quick(0,obj1.n-1);
        System.out.println("values after sorting:");
        obj1.display();
    }
}