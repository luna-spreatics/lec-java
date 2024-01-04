package _05_class._01_class;

import java.util.Scanner;

public class ExRectangle01 {
    //  필드 (변수)
    public int width;
    public int height;

    public ExRectangle01(int width, int height) {
        // 지역변수와 필드 변수명이 동일하기 때문에 this를 사용해서 필드 값에 접근
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
//        사용자에게 안내 메시지 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요: ");

        // 사용자로부터 가로와 세로 길이를 한번에 입력 받음
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // 입력 받은 값으로 Rectangle 객체 생성
        ExRectangle01 rectangle = new ExRectangle01(width, height);
        System.out.println("사각형의 넓이 : " + rectangle.area());

        // 스캐너 닫기
        scanner.close();

    }
}
