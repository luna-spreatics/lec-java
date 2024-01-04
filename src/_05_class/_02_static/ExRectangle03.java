package _05_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class ExRectangle03 {

    private double width;
    private double height;
    private static int instanceCount = 0; // Rectangle 인스턴스의 개수를 추적하는 클래스 변수 추가

    public ExRectangle03(double width) {
        this.width = width;
        instanceCount++; // 새로운 Rectangle 인스턴스가 생성될 때마다 개수 증가
    }

    public double area() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle03{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    // Rectangle 인스턴스의 개수를 반환하는 클래스 메서드 추가
    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        ArrayList<ExRectangle03> rectangles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요 (0 입력시 종료) : ");
            double width = scanner.nextDouble();

            if (width == 0) {
                break;
            }

            ExRectangle03 rectangle = new ExRectangle03(width);
            double height = scanner.nextDouble();
            rectangle.setHeight(height);

            rectangles.add(rectangle);
        }

        System.out.println("\n입력된 Rectangle 정보:");

        for (ExRectangle03 rectangle : rectangles) {
            System.out.println(rectangle);
            System.out.println("가로 길이는: " + rectangle.getWidth());
            System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.area());
            System.out.println("-----------------------------------");
        }

        // Rectangle 인스턴스의 개수를 출력
        System.out.println("Rectangle 인스턴스의 개수는: " + ExRectangle03.getInstanceCount());

        scanner.close();
    }
}
