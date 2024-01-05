package _05_class._05_abstract.ex2;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<Shape> shapeList = new ArrayList<>();

        // Circle 객체 생성 및 리스트에 추가
        Circle myCircle = new Circle("Red", 5.0);
        shapeList.add(myCircle);

        // Rectangle 객체 생성 및 리스트에 추가
        Rectangle myRectangle = new Rectangle("Blue", 4.0, 6.0);
        shapeList.add(myRectangle);

        // 각 도형의 정보 출력
        for (Shape shape : shapeList) {
            System.out.printf("\n==== %s 도형의 정보 ====\n", shape.getType());
            System.out.println("도형의 색상: " + shape.getColor());
            System.out.println("도형의 넓이: " + shape.calculateArea());
        }
    }
}
