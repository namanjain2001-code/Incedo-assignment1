import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int count=0;
        int  test=2;
        int sum=0;
        while(count<num)
        {
            int flag=1;

            for(int i=2;i<=Math.sqrt(test);i++)
            {
                if(test%i==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(test+" ");
                sum=sum+test;
                count++;
                
            }
            
            test++;
        }
        System.out.println("");
        System.out.println("Sum of the prime number is "+sum);
        System.out.println("Avg of the number prime is "+sum/num);
    }
}
