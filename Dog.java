package week12;


public class Dog {
    String name; // 이름
    String breeds; // 품종
    int age; // 나이
    String color; // 색깔
    boolean isTrained; // 훈련 여부

    // 강아지 색깔과 훈련 여부까지 포함하는 생성자
    public Dog(String name, String breeds, int age, String color, boolean isTrained) {
        this.name = name;
        this.breeds = breeds;
        this.age = age;
        this.color = color;
        this.isTrained = isTrained;
    }

    // 꼬리를 흔드는 메소드
    void wag() {
        System.out.printf("[%s] 살랑살랑 꼬리를 흔듭니다.\n", name);
    }

    // 짖는 메소드 (한 번 짖기)
    void bark() {
        System.out.printf("[%s] 멍멍!\n", name);
    }

    // 짖는 메소드 (여러 번 짖기)
    void bark(int times) {
        String sound = isTrained ? "경고 짖음" : "흥분 짖음"; // 훈련 여부에 따라 짖는 소리 다르게 표현
        System.out.printf("[%s] %s (%d회)\n", name, sound, times);
    }

    // 먹는 메소드
    void eat(String food) {
        System.out.printf("[%s] %s를 맛있게 먹습니다.\n", name, food);
    }

    // 간단한 정보 출력 메소드
    void printInfo() {
        System.out.printf("이름: %s, 품종: %s, 나이: %d살, 색깔: %s, 훈련 여부: %s\n",
                name, breeds, age, color, isTrained ? "예" : "아니오");
    }

    // 메인 메소드
    public static void main(String[] args) {
        // 강아지 객체 생성
        Dog d1 = new Dog("망고", "골든리트리버", 2, "황금색", true);
        Dog d2 = new Dog("까미", "믹스", 3, "검은색", false);

        // 강아지 정보 출력
        d1.printInfo();
        d2.printInfo();

        System.out.println();

        // 강아지 행동 수행
        d1.wag();
        d2.wag();

        d1.bark();
        d2.bark(3); // 까미는 3번 짖음

        d1.eat("사료");
        d2.eat("간식");
    }
}
