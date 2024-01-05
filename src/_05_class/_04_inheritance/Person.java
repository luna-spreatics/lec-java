package _05_class._04_inheritance;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 부모 클래스 생성자에 매개변수가 필요할 경우
    public Person(String name) {
        setName(name);
    }
}

