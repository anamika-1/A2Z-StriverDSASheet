import java.util.Scanner;

public class AZ1_2Pattern6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
    }
}
