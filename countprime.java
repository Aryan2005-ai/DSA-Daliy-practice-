import java.util.Scanner;
public class countprime
{
    public static void main(String [] args)
    {
       int count=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number \n");
       int n=sc.nextInt();
       boolean arr[] =new boolean [n];
       for(int a=2;a<n;a++)
       {
           arr[a]=true;
       }
       for(int i=2;i<=n/i;i++)
       {
           if(arr[i])
           {
               for(int j=i*i;j<n;j+=i)
               {
                   arr[j]=false;
               }
           }
       }
       for(int i =2;i<n;i++)
       {
           if(arr[i])
           {
               count++;
           }
       }
       System.out.println("Total no of prime numbers are "+ count);
       
    }
}