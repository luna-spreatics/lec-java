package _05_class._01_class;

public class ClassName {
    //    필드(변수)
    public int number;
    public String name;

//    메소드

    //    생성자
    public ClassName() {

    }

    public void testMethod() {
        System.out.println("test method!");
    }

    public static void main(String[] args) {
        ClassName test = new ClassName();
        test.testMethod();
    }
}
