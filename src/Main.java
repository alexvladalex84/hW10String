public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("task1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;


        System.out.println("Ф.И.О. сотрудника - " + fullName);


    }

    public static void task2() {
        System.out.println("task2");/*Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,

         полностью написанные заглавными буквами (верхним регистром).
                 Напишите программу, которая изменит написание Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
         В качестве строки с исходными данными используйте строку fullName.
                 Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"*/


        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета  ̶ " + upperFullName);


    }

    public static void task3() {
        System.out.println("task3");
       /* Система, в которой мы работаем, не принимает символ «ё». Напишите программу, которая заменяет символ «ё» на символ «е».
        В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
                Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».*/

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");     // метод replace() заменил символы
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }


}