package week12;

public class Car {
    private String no;
    private String company;
    private String color;
    private int mile;

    // 여러 생성자 정의 (오버로딩)
    public Car(String no) {
        this.no = no;
        this.company = "Unknown";
        this.color = "Black";
        this.mile = 0;
    }

    public Car(String no, String company) {
        this.no = no;
        this.company = company;
        this.color = "Black";
        this.mile = 0;
    }

    public Car(String no, String company, String color) {
        this.no = no;
        this.company = company;
        this.color = color;
        this.mile = 0;
    }

    public Car(String no, String company, String color, int mile) {
        this.no = no;
        this.company = company;
        this.color = color;
        this.mile = mile;
    }

    // Getter 및 Setter 메서드
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }
}
