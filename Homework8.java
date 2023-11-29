import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> idandpw = new HashMap<>();
        idandpw.put("myid", "mypass");
        idandpw.put("myid2", "mypass2");
        idandpw.put("myid3", "mypass3");

        // 사용자로부터 ID 입력 받기
        Scanner scan = new Scanner(System.in);
        System.out.printf("id와 password를 입력해주세요\n");
        System.out.printf("id : ");
        String idinput = scan.nextLine().trim();

        if (idandpw.containsKey(idinput)) {
            System.out.printf("password: ");
            String pwinput = scan.nextLine().trim();

            if (pwinput.equals(idandpw.get(idinput))) {
                System.out.println("id와 비밀번호가 일치합니다.");
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
            
        } else {
            System.out.println("입력하신 ID가 존재하지 않습니다. 다시 입력해주세요");
        }

            
        }
    }
