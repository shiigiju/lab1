import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int k = 0;
        boolean flag = true;
        if (x<=a && flag==true){
            k=k+1;
        } else{ flag = false;};
        
        if (x<=b && flag==true){
            k=k+1;
        } else{ flag = false;};
        
        if (x<=c && flag==true){
            k=k+1;
        } else{ flag = false;};
        
        if (x<=d && flag==true){
            k=k+1;
        } else{ flag = false;};
        System.out.println(k);
    }
    
}