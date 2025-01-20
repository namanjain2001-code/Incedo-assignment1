
import java.util.Scanner;

public class Test {
     static String fun(long num)
    {
        String words[] = { " ", " one ", " two ", " three ", " four ", " five ", " six ", " seven ", " eight ", " nine ", " ten ", " eleven ",
                " twelve ", " thirteen ", " fourteen ", " fifteen ", " sixteen ", " seventeen ", " eightteen ", " nineteen " };
        String words1[] = { " ", " ten ", " twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ", " eightty "," ninety " };
        String words2[] = { " hundred " };

        
        char number[] = String.valueOf(num).toCharArray();
        String ans = "";
        if (number.length == 3) {
            ans = words[(int) number[0] - 48] + " " + words2[0];
            if (number[1] >= '2') {
                ans = ans + words1[(int) number[1] - 48] + words[(int) number[2] - 48];
            } else

            {
                ans = ans + words[(int)num % 100];
            }

        } else if (number.length == 2) {
            if (number[0] >= '2') {
                ans = ans + words1[(int) number[0] - 48] + words[(int) number[1] - 48];
            } else

            {
                ans = ans + words[(int)num % 100];
            }
        } else {
            ans = words[(int)num];
        }
        return ans;
    
    }
    public static void main(String[] args) {
        
        System.out.println("Enter number to convert");
        Scanner scan = new Scanner(System.in);
        long number=scan.nextLong();
        if(number==0)
        {
            System.out.println("Zero");
            return;
        }
        String woo[]={" thousand ","million"," billion "," trillion "};
        String ans=fun(number%1000);
        number=number/1000;
        int i=0;
        while(number!=0)
        {
            if(fun(number%1000)!=" ")
            {ans=fun(number%1000)+woo[i]+ans;
            }
            else
            ans=fun(number%1000)+ans;
            i++;
            number=number/1000;
        }
        System.out.println(ans);


    }
}
