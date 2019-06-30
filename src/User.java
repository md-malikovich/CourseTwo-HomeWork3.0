public class User {

    private String name;
    private int age;

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

    public void userAge() throws IllegalAgeException {

        if (age >= 1 && age <= 100 ) {
            System.out.println("Возраст человека в пределах 1 - 100");
        } else {
            throw new IllegalAgeException ("Возраст человека в пределах превышает 100 лет");
        }
    }
}
