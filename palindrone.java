import java.util.Scanner;
public class palindrone
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the number \n");
        n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n!=0)
        {
            int digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
            
        }
        if(temp==rev)
        {
          System.out.println("It is a palindrone number \n"); 
        }
        else
        {
            System.out.println("It is not a palindrone number \n"); 
        }
    }
}