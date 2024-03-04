package CustomExceptionsKlas;

public class Person {
    private int age;

    private String name;

    public Person(int age, String name) throws ToYoungPersonException {
        if (age < 0) {
            throw new ToYoungPersonException();
        }
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("name: %s\nage: %s", this.name, this.age);
    }

}
