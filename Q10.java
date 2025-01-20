import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=0;i<=num;i++)
        {
            
        String s=Integer.toString(i);
        char[] c = s.toCharArray();
        int front=0;
        int back=s.length()-1;
        int flag=1;
        while(front <back)
        {
            if(c[front]==c[back])
            {
                front++;
                back--;
                
            }
            else
            {
                flag=0;
                break;
                
            }
        }
        if(flag==1)
        System.out.print(i+" ");
        }
    }
}
