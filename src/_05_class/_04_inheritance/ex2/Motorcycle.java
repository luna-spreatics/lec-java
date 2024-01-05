package _05_class._04_inheritance.ex2;

// Motorcycle 클래스, Vehicle 클래스를 상속
class Motorcycle extends Vehicle {
    // Motorcycle에만 해당하는 추가 속성
    private String licenseType;

    // 생성자
    public Motorcycle(String brand, String model, int year, String licenseType) {
        // 부모 클래스의 생성자 호출하여 초기화
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    // 올림통을 하는 동작
    public void wheelie() {
        System.out.println("올림통을 합니다.");
    }

    // 객체 정보를 문자열로 반환하는 메소드를 오버라이드
    @Override
    public String toString() {
        return "Motorcycle {" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", licenseType='" + licenseType + '\'' +
                '}';
    }
}