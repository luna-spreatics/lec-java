package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class ExRectangle02 {
    //  필드 (변수)
    private int width;
    private int height;

    public ExRectangle02(int width) {
        // 지역변수와 필드 변수명이 동일하기 때문에 this 를 사용해서 필드 값에 접근
        this.width = width;
    }

    public int area() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<ExRectangle02> rectangles = new ArrayList<>();
//        사용자에게 안내 메시지 출력
        Scanner scanner = new Scanner(System.in);// 사용자로부터 가로와 세로 입력받아 ArrayList에 Rectangle 인스턴스를 차례로 추가
        while (true) {
            System.out.print("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요 (0 입력시 종료) : ");
            int width = scanner.nextInt();


            // 0이 입력되면 입력 종료
            if (width == 0) {
                break;
            }

            ExRectangle02 rectangle = new ExRectangle02(width);
            int height = scanner.nextInt();

            // 세로 길이 설정
            rectangle.setHeight(height);

            // ArrayList에 Rectangle 객체 추가
            rectangles.add(rectangle);
        }

        // 입력된 Rectangle 객체들의 정보 출력
        System.out.println("\n입력된 Rectangle 정보:");

        for (ExRectangle02 rectangle : rectangles) {
            System.out.println(rectangle);
            System.out.println("가로 길이는: " + rectangle.getWidth());
            System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.area());
            System.out.println("-----------------------------------");
        }


        // 스캐너 닫기
        scanner.close();

    }
}
