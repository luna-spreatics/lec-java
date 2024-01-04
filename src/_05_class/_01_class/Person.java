package _05_class._01_class;

public class Person {
    private int age;
    private String name;

    public Person(String name) {
        this.name = name;
    }

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

    public static void main(String[] args) {
        Person codee = new Person("코디");
        codee.age = 10; // 권장X
        System.out.println(codee.name); // 권장X

        Person codee2 = new Person("codee");
        codee2.setAge(10); // O
        System.out.println(codee2.getName());

    }
}
