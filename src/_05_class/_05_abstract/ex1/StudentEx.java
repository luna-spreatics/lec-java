package _05_class._05_abstract.ex1;

// 테스트를 위한 메인 클래스
public class StudentEx {
    public static void main(String[] args) {
        // Kim 객체 생성 및 출력
        Kim kimStudent = new Kim("김철수", "ABC 고등학교", 17, "20220001");
        System.out.printf("\n==== %s 학생의 정보 ====\n", kimStudent.name);
        System.out.println("학교: " + kimStudent.school);
        System.out.println("나이: " + kimStudent.age);
        System.out.println("학번: " + kimStudent.studentId);
        kimStudent.todo();

        // Baek 객체 생성 및 출력
        Baek baekStudent = new Baek("백영희", "XYZ 고등학교", 18, "20220002");
        System.out.printf("\n==== %s 학생의 정보 ====\n", baekStudent.name);
        System.out.println("학교: " + baekStudent.school);
        System.out.println("나이: " + baekStudent.age);
        System.out.println("학번: " + baekStudent.studentId);
        baekStudent.todo();
    }
}