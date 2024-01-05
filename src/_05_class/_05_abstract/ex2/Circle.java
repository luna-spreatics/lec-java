package _05_class._05_abstract.ex2;

// Circle 클래스, Shape 클래스를 상속
class Circle extends Shape {
    // 원의 반지름을 나타내는 속성
    private double radius;

    // 생성자: 색상과 반지름을 초기화
    public Circle(String color, double radius) {
        // 부모 클래스의 생성자 호출하여 초기화
        super(color, "Circle");
        this.radius = radius;
    }

    // 원의 넓이를 계산하는 메소드를 오버라이딩
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}