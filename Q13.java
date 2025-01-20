import  java.util.*;
public class Q13 {
    
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int space=num-1;
        int star=1;
        for(int j=0;j<num;j++)
        {
            for(int i=0;i<space;i++)
            {
                System.out.print(" ");
            }
            for(int i=0;i<star;i++)
            {
                System.out.print(j);
            }
            for(int i=0;i<space;i++)
            {
                System.out.print(" ");
            }
            space=space-1;
            star=star+2;
            System.out.println("");
        }
    }
    }

