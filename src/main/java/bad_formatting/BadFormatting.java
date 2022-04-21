package bad_formatting;

import java.util.List;

public class BadFormatting {
    private String name;
    private int age;
    private String nickName;
    private List<String> hobby;

    public String basicIntroduce() {
        return String.format("my name is %s, I'm %d years old", getName(), getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
