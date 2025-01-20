import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String s=Integer.toString(num);
        char[] c = s.toCharArray();
        int front=0;
        int back=s.length()-1;
        String ans="it is pallendrom";
        while(front <back)
        {
            if(c[front]==c[back])
            {
                front++;
                back--;
                
            }
            else
            {
                ans="not pallendrome";
                break;
            }
        }
        System.out.println(ans);

    }
}
