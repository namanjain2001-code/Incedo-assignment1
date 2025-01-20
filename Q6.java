import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int check=0;
        int number=num;
        int dig=(int)Math.ceil(Math.log10(num));
        while(num!=0){
            int temp=num%10;
            num=num/10;
            check=check+(int)Math.pow(temp,dig);

        }
        if(check==number)
        System.out.println("the number is a armstrong number");
        else
        System.out.println("the number is not a armstrong number");
    }
}
