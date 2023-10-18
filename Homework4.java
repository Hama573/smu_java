import java.util.Scanner;


public class Homework4 {
    static int gcd(int m, int n) {
        if (m == 0) {
            return m;
        }
        else if(m%n==0) {
            return n;
        }
        else {
            return gcd(n, m%n);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.printf("두 수를 입력하세요: ");
        m = sc.nextInt();
        n = sc.nextInt();

        int k = gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.", k);


    }

}
