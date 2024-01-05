package _05_class._05_abstract.ex2;

// Shape 추상 클래스 정의
abstract class Shape {
    // 도형의 색상을 나타내는 속성
    private String color;
    private String type;

    // 생성자: 색상을 초기화
    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    // 도형의 넓이를 계산하는 추상 메소드
    public abstract double calculateArea();

    // 색상을 반환하는 메소드
    public String getColor() {
        return color;
    }

    // 도형의 종류를 반환하는 메소드
    public String getType() {
        return type;
    }
}
