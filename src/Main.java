public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;

        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        System.out.println("\nTask 2");

        String fullNameUpperCase = fullName.toUpperCase();

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);

        //Task 3
        System.out.println("\nTask 3");

        fullName = "Иванов Семён Семёнович";
        String fullNameReplacedChar = fullName.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameReplacedChar + "\n");
    }
}