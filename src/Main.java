import java.util.Scanner;
public class Main extends Throwable {

    private static String name;

    public static void main(String[] args) {

        User user = new User();
        //user.setAge(20);
        //user.setName("User");
        try {
            while (user.getAge() > 1) {
                Scanner scan = new Scanner(System.in);
                int age = scan.nextInt();
                String name = scan.next();
                System.out.println("Имя пользователя " + name + ". Возраст пользователя " + age);
            }
        } catch (Exception other1) {
            System.out.println("Другая ошибка");
            System.out.println(other1.getMessage());
        }

        try {
            System.out.println(name);
        } catch (IllegalNameLengthException qwe) {
            System.out.println("Длина имени больше 20 символов");
            System.out.println(qwe.getMessage());
        } catch (Exception other) {
            System.out.println("Другая ошибка");
            System.out.println(other.getMessage());
        } finally {
            System.out.println("---");
        }

        public static void nameLength () throws IllegalNameLengthException {

            if (name.length() > 20) {
                throw new IllegalNameLengthException();
                System.out.println("Длина имени больше 20 символов");
            } else {
                System.out.println(name.length());
            }
        }
    }
}
//1.Разработать проверяемое Исключение:
//Исключение которое выбрасывается если длина имени больше 20 символов, назовите IllegalNameLengthException.

//2.Разработать непроверямое Исключение, которое выбрасывается если возраст человека вне предела 1-100, назовите IllegalAgeException.

//3.Разработать класс User со свойствами name, age, с методами getter/setter
//В методах setter проверять на ошибки и в случае ошибки выбрасывать разработанные исключения.

//4.Разработать в методе main, бесконечный цикл для ввода имени и возраста Пользователя и установить их через setter
//при этом ловить выбрасываемые исключения.
