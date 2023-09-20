import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int str[] = new int[5]; // 숫자를 저장할 배열
        int sum = 0; // 숫자의 총합 저장 예정

        for(int i=0; i<5; i++) {
            System.out.printf("정수를 입력하세요 : ");
            str[i] = sc.nextInt();
            sum += str[i];
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }

    }

}
