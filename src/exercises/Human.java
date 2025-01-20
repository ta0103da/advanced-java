package exercises;

public class Human {
    private String name;
    private int age;
    private String birthPlace;

    @Override
    public String toString() {
        return "Human[name=" + name + ", age=" + age + ", birthPlace=" + birthPlace + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }
    
}
