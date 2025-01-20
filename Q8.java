import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        String words[][]={
            {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eightteen","nineteen"}
           ,{" ","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"}
           ,{" ","hundred","1error","1error"}
           ,{" ","thousand"}
        };
    
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int dig=(int)Math.ceil(Math.log10(num));
    String ans = "";
    int count=0;

    while(num!=0)
    {

        ans=words[0][num%10]+" "+words[count][1]+" "+ans;
        System.out.println(count + " "+ num%10);
        num=num/10;
        count++;
    }
    System.out.println(ans);
}

}
