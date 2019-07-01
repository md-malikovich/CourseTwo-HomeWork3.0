import java.util.Scanner;

public class Main {

    private static String name;

    public static void main(String[] args) throws IllegalNameLengthException, IllegalAgeException {

        User user = new User();
        user.setName("MederDiushebekov");    // Если указать более 20 символов - выйдет ошибка
        user.setAge(100);                    // Если указать число вне предела 1-100 - выйдет ошибка

        while (user.getAge() > 0) {
            try {
                Scanner scan = new Scanner(System.in);
                int age = scan.nextInt();
                String name = scan.next();
                user.setName("MederDiushebekovMederDiushebekovMederDiushebekov");
                user.setAge(500);
                System.out.println("Имя пользователя " + name + ". Возраст пользователя " + age);
            } catch (Exception other1) {
                System.out.println("Другая ошибка");
                System.out.println(other1.getMessage());
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
