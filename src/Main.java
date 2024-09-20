
public class Main {
    public static void main(String[] args) {

        /* Задание 5
        К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
        разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        В качестве исходных данных используйте: Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        переменная firstName — для хранения имени;
        переменная middleName — для хранения отчества;
        переменная lastName — для хранения фамилии.
        Решите задание с помощью метода substring().
        Результат программы выведите в формате:
        “Имя сотрудника — …”
        “Фамилия сотрудника — …”
        “Отчество сотрудника — ...”
        Подсказка: Определить индексы символов помогут методы indexOf() и lastIndexOf().
        */
        {
            System.out.println("Задача 5");
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println(fullName);
            int firstIndex = fullName.indexOf(' ');
            int lastIndex = fullName.lastIndexOf(' ');
            String lastName = fullName.substring(0, firstIndex);
            System.out.println("Фамилия сотрудника — " + lastName);
            String firstName = fullName.substring(firstIndex + 1, lastIndex);
            System.out.println("Имя сотрудника — " + firstName);
            String middleName = fullName.substring(lastIndex + 1, fullName.length() - 1);
            System.out.println("Отчество сотрудника — " + middleName);
            System.out.println();
        }

        /* Задание 6
        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников
        записывают со строчных букв. Такую оплошность нужно исправить, написав программу,
        которая преобразует написанное сострочных букв Ф. И. О. в правильный формат.
        В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
        которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника сзаглавных букв —  …”
        Подсказка 1: Метод toCharArray() может быть полезен.
        Подсказка 2: Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c),
        где c — символ.
        **/
        {
            System.out.println("Задача 6");
            String fullName = "ivanov ivan ivanovich";
            System.out.println("Неверное написание Ф.И.О. сотрудника —  " + fullName);
            char[] charArray = fullName.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            for (int i = 1; i < charArray.length; i++) {
                if (charArray[i] == ' ') {
                    charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
                }
            }
            String fullNameCorrect = new String(charArray);
            System.out.println("Верное написание Ф.И.О. сотрудника с заглавных букв —  " + fullNameCorrect);
            System.out.println();
        }
        /* Задание 7
        Имеется две строки.
        Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
        Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”
        Подсказка: Следует использовать StringBuilder.
         */
        System.out.println("Задача 7");
        String line1 = "135";
        String line2 = "246";
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < line1.length(); i++) {
            line.append(line1.charAt(i));
            line.append(line2.charAt(i));
        }
        String lineResult = line.toString();
        System.out.println("Данные строки — " + lineResult);
        System.out.println();

        /* Задание 8
        Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        Нужно найти и напечатать буквы, которые дублируются в строке.
        Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
        В итоге в консоль должен быть выведен результат программы: "acdgijk".
        * */
        {
            System.out.println("Задача 8");
            String line3 = "aabccddefgghiijjkk";
            for (int i = 0; i < line3.length() - 1; i++) {
                if (line3.charAt(i) == line3.charAt(i + 1)) {
                    System.out.print(line3.charAt(i));
                }
            }
        }
    }
}