package _05_class._05_abstract.ex1;

// Student 추상 클래스 정의
abstract class Student {
    // 이름, 학교, 나이, 학번을 나타내는 속성
    protected String name;
    protected String school;
    protected int age;
    protected String studentId;

    // 생성자
    public Student(String name, String school, int age, String studentId) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentId = studentId;
    }

    // 추상 메소드
    public abstract void todo();
}
