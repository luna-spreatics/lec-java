package _05_class._05_abstract.ex2;

// Rectangle 클래스, Shape 클래스를 상속
class Rectangle extends Shape {
    // 사각형의 가로와 세로를 나타내는 속성
    private double width;
    private double height;

    // 생성자: 색상과 가로, 세로를 초기화
    public Rectangle(String color, double width, double height) {
        // 부모 클래스의 생성자 호출하여 초기화
        super(color, "Rectangle");
        this.width = width;
        this.height = height;
    }

    // 사각형의 넓이를 계산하는 메소드를 오버라이딩
    @Override
    public double calculateArea() {
        return width * height;
    }
}
