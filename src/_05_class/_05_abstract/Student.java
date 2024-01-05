package _05_class._05_abstract;

public class Student extends Person {
    // Student 클래스는 Person 의 추상 메소드인 printName()을 구현해야만 일반 클래스로 쓰일 수 있음
    // 오버라이딩 필요
    @Override
    public void printName() {
        System.out.println("학생 : " + getName());
    }

}
