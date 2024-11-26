package week12;

public class Love {
    private String name;
    private int year;
    private String story;
    private int period;
    private int level;

    // 생성자
    public Love(String name, int year, String story, int period, int level) {
        this.name = name;
        this.year = year;
        this.story = story;
        this.period = period;
        this.level = level;
    }

    // Getter 및 Setter 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
