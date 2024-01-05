package _05_class._04_inheritance.ex1;

class Animal {
    // "종“, "이름", "나이"을 의미하는 변수
    private String species;
    private String name;
    private int age;

    // 생성자
    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    // makeSound 메소드
    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }

    // Getter 메소드
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}