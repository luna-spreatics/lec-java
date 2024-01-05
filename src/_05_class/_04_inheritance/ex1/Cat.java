package _05_class._04_inheritance.ex1;

// Cat 클래스, Animal 클래스를 상속
class Cat extends Animal {
    // 추가적인 속성 혹은 동작이 있다면 필드와 메소드를 추가

    // 생성자
    public Cat(String name, int age) {
        // Animal 클래스의 생성자 호출하여 초기화
        super("고양이", name, age);
    }

    // makeSound 메소드를 오버라이드하여 각 동물이 내는 소리 출력
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }

    // Cat 클래스에만 해당하는 메소드 등을 추가할 수 있음
}

