package week12;

public class LoveTest {

    public static void main(String[] args) {
        // Love 객체 생성 및 테스트
        Love love1 = new Love("박애나 2024", 2024, "밥이랑 먹다가 사랑을 고백하고 종교대학에 헤어짐", 1, 10);
        System.out.println("Love 객체 초기화:");
        System.out.println("Name: " + love1.getName() + ", Story: " + love1.getStory() + ", Level: " + love1.getLevel());

        // Story 갱신
        love1.setStory("새로운 이야기로 갱신됨");
        System.out.println("갱신된 Story: " + love1.getStory());

        // Car 객체 생성 및 테스트
        Car car1 = new Car("1234", "Hyundai", "White", 10000);
        System.out.println("\nCar 객체 초기화:");
        System.out.println("No: " + car1.getNo() + ", Company: " + car1.getCompany() + ", Color: " + car1.getColor() + ", Mile: " + car1.getMile());

        // Color 갱신
        car1.setColor("Blue");
        System.out.println("갱신된 Color: " + car1.getColor());
    }
}
