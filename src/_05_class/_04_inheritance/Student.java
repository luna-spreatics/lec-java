package _05_class._04_inheritance;

public class Student extends Person {
    private String school;

    public Student(int age, String name) {
        // 부모 클래스 생성자에 매개변수가 필요할 경우
        super(name); // 자식 클래스 생성자 첫 줄에서 super() 사용
        // 부모 클래스의 멤버에 접근 가능
        setAge(age);
        setName(name);

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
