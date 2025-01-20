
public class Q7 {
    public static void main(String[] args) {
        for(int i=0;i<=1000;i++)
        {
            int check=0;
            int num=i;
            int dig=(int)Math.ceil(Math.log10(num));
            while(num!=0){
                int temp=num%10;
                num=num/10;
                check=check+(int)Math.pow(temp,dig);

            }
            if(check==i)
            System.out.print(i+" ");
        
    }
}
}
