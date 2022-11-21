import java.util.*;
public class ty {
    public static void main(String a[]){
      Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int count=0;
        char c1=s2.charAt(s2.length()-1);
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==c1){
                count++;
            }
        }
        System.out.println(count);
    }
}
