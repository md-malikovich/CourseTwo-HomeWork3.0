public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        this.name = name;
        if (name.length() > 20) {
            throw new IllegalNameLengthException();
        } else {
            System.out.println("Количество символов в имени = " + name.length());
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {

        this.age = age;
        if (age >= 1 && age <= 100 ) {
            System.out.println("Возраст человека в пределах 1 - 100");
        } else {
            throw new IllegalAgeException ("Возраст человека в пределах превышает 100 лет");
        }
    }
}
