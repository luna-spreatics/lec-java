package _05_class._03_final;

import java.util.Scanner;

public class Circle01 {
    // 3. 반지름(final 필드로 선언하여 변경 불가능하게 함)
    private final double radius;

    // 5. 원주율 상수(final 변수로 선언)
    private static final double PI = 3.141592653589793;

    // 2. 생성자
    public Circle01(double radius) {
        this.radius = radius;
    }

    // 4. 원의 넓이를 계산하여 반환하는 메서드
    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 반지름을 사용자로부터 입력 받음
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();

        // Circle 객체 생성
        Circle01 circle = new Circle01(radius);

        // 반지름과 넓이 출력
        System.out.println("원의 반지름: " + circle.radius);
        System.out.println("원의 넓이: " + circle.calculateArea());

        // 스캐너 닫기
        scanner.close();
    }
}
