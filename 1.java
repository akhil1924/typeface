import java.util.*;
public class ty {
   public int base(int n){
        int x=0;
        String s1="",s2="";
        while(n>0){
            x=n%3;
            n=n/3;
            s1=String.valueOf(x);
            s2=s1+s2;
        }
        int i=Integer.parseInt(s2);
        return i;
        }
    public static void main(String a[]){ 
Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        System.out.print(base(n));
        
    }
}
