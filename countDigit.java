import java.util.Scanner;
public class AllDivisible {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            if(n%i==0){
System.out.println(i+"");
            }
            i++;
        }
    }
}
