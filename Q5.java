import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        int ans=0;
        while(num!=0)
        {
            ans=ans+(num%10);
            num=num/10;
        }
        System.out.println(ans);

    }
}
