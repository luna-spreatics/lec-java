package _02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// - 즉, 이름이 같고 매개변수 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 편리

// 정적 바인딩
// - "컴파일" 시점에 어떤 메서드가 호출될지를 결정함
public class MethodOverloading {

    public static void main(String[] args) {

        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메서드 사용
        System.out.println(ol.add(1, 2));
        System.out.println(ol.add(2.2, 3.3));
        System.out.println(ol.add(1, 2, 3));
//		System.out.println(ol.add(2.2, 3.3, 5.6)); // Error
        System.out.println(ol.add(1.1, 2.2, 4.4)); // 출력: 7.700000000000001
        // WHY? 부동소수점의 한계: https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%8B%A4%EC%88%98-%ED%91%9C%ED%98%84%EB%B6%80%EB%8F%99-%EC%86%8C%EC%88%98%EC%A0%90-%EC%9B%90%EB%A6%AC-%ED%95%9C%EB%88%88%EC%97%90-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}