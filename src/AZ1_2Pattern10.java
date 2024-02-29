import java.util.Scanner;

public class AZ1_2Pattern10 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n - 1; i++){
            int x =  i;

            if( i > n){
                x = 2*n-i;
            }
            for(int j = 1; j <= x; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
