import java.util.Scanner;


class Homework2_Student {
    int studentnum;
    String name;
    String major;
    String phonenum;

    // 생성자
    public Homework2_Student(int studentnum, String name, String major, String phonenum) {
        this.studentnum = studentnum;
        this.name = name;
        this.major = major;
        this.phonenum = phonenum;
    }

    // Getter 메소드
    public int getstudentnum() {
        return studentnum;
    }

    public String getname() {
        return name;
    }

    public String getmajor() {
        return major;
    }

    public String getphonenum() {
        return phonenum;
    }

    // Setter 메소드
    public void setstudentnum(int studentnum) {
        this.studentnum = studentnum;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setmajor(String major) {
        this.major = major;
    }

    public void setphonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}


public class Homework2 {
    public static void main(String[] args) {

    
        Scanner scan = new Scanner(System.in);

        // 학생 정보를 저장할 배열 생성
        Homework2_Student[] students = new Homework2_Student[3];

        // 3명의 학생 정보 입력 받기
        for (int i = 0; i < 3; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int studentnum = scan.nextInt();
            String name = scan.next();
            String major = scan.next();
            String phonenum = scan.next();

            // 전화번호 형식 변환 (010-xxxx-xxxx)
            phonenum = phonenum.substring(0, 3) + "-" + phonenum.substring(3, 7) + "-" + phonenum.substring(7);

            students[i] = new Homework2_Student(studentnum, name, major, phonenum);

            /*
            // Homework2_Student 객체 생성 및 배열에 저장
            // 이 부분 오류 발생으로 일반적인 저장 방식 사용
            students[i] = new Homework2_Student();
            students[i].setstudentnum(studentnum);
            students[i].setname(name);
            students[i].setmajor(major);
            students[i].setphonenum(phonenum);
            */
        }

        // 입력된 학생 정보 출력

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        int i = 1;
        for (Homework2_Student student : students) {
            System.out.println(i + "번째 학생: " + student.getstudentnum() + " " +
            student.getname() + " " + student.getmajor() + " " + student.getphonenum());
        i++;
        }




        scan.close();
    }
    
}

