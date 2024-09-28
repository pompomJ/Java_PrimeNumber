import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("自然数を入力してください: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

	if (num == 1) {
	   System.out.println(num + "は素数ではありません。");
	} else if (isPrime) {
            System.out.println(num + "は素数です。");
        } else {
            System.out.println(num + "は素数ではありません。");
        }
    }
}
