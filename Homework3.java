import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 정수를 입력할 예정인가요? ");
        int howmany = scanner.nextInt();

        // 입력된 수 만큼 배열을 생성
        int[] nums = new int[howmany];

        // 최소값과 최대값 변수 초기화
        int min = 2147483647;
        int max = -2147483648;

        // 정수 입력을 받고 배열에 저장
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < howmany; i++) {
            int input = scanner.nextInt();
            nums[i] = input;

            // 최소값과 최대값 업데이트
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}