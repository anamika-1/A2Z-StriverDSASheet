import java.util.Scanner;

public class AZ1_2Pattern4 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n;  i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

    }
}
