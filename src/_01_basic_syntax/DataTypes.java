package _01_basic_syntax;

// reference
// - https://jdm.kr/blog/213
// - https://www.devkuma.com/docs/java/data-type/

// 자료형
// ㄴ Primitive Type(기본형)
//     ㄴ Boolean Type(boolean)
//     ㄴ Numeric Type
//        ㄴ Integral Type
//            ㄴ Integer Type(short, int, long)
//            ㄴ Floating Point Type(float, double)
//     ㄴ Character Type(char)
// ㄴ Reference Type(참조형)
//     ㄴ Class Type
//	   ㄴ Interface Type
//     ㄴ Array Type
//     ㄴ Enum Type
//     ㄴ ...

// Primitive Type(기본형)
// - 사용되기 전에 선언되어야 함
// - OS 에 따라 자료형 길이 변하지 않음
// - "비객체" 타입 -> null 값 가질 수 없음

// Reference Type(참조형)
// - java.lang.Object 상속받음
// - 기본형이 아니면 모두 참조형

public class DataTypes {

  public static void main(String[] args) {
    // Primitive Type(기본형)
    System.out.println("==== Primitive Type ====");
    // 정수형 변수 선언
    int x = 10;
    long y = 1000000000L; // long 타입은 뒤에 'L' 또는 'l'을 붙여야 함
    short z = 32767;
    byte b = 127;

    // 실수형 변수 선언
    float a = 3.14f; // float 타입은 뒤에 'f' 또는 'F'를 붙여야 함
    double c = 2.71828;

    // 문자형 변수 선언
    char ch = 'A';

    // 논리형 변수 선언
    boolean bool = true;

    // 변수 출력
    System.out.println("정수형 변수: " + x + ", " + y + ", " + z + ", " + b);
    System.out.println("실수형 변수: " + a + ", " + c);
    System.out.println("문자형 변수: " + ch);
    System.out.println("논리형 변수: " + bool);

    /////////////////////////////////////////////////////////////////////////
    // Reference Type(참조형)
    System.out.println("==== Reference Type ====");

    // String 참조형 변수 선언과 초기화
    // - Java 에서 String 타입은 특별함. 참조형이지만 기본형처럼 사용함. (불변(immutable) 객체)
    // - 기본 자료형은 "==" 연산자를 통해 비교하지만, String 객체간 비교는 .equals() 메서드 사용
    String greeting = "Hello, World!";

    // 배열 (Array) 참조형 변수 선언과 초기화
    int[] numbers = {1, 2, 3, 4, 5};

    // 클래스 (Class) 참조형 변수 선언과 초기화
    Person person = new Person("John Doe", 30);

    // 출력
    System.out.println("String 변수: " + greeting);
    // ver. 일반 for 문
    System.out.print("배열 변수: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    // ver. for-each 문
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
    System.out.println();
    System.out.println("Person 객체: " + person.getName() + ", " + person.getAge() + " years old.");
  }

}

// 클래스 (추후 배울 예정)
class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
