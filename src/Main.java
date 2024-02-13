import Model.ModelCheck;


public class Main {
    public static void main(String[] args) {
        /**
         * Номер телефона возможно не совсем правильно проверил, без кода страны и только сотовый,
         * поэтому проверка идет на то, чтобы номер содержал 10 цифр, если ввести меньше или больше знаков, кинет
         * исключение, если ввести букву, то тоже кинет исключение.
         */

        // Проверка данных реализована в ModelCheck (package Model)
        // Запись в файл в классе Writer (package Model)
        // Кастомные исключения в папке MyException
        // Итоговая строка для записи берется из класса Person
        // Ввод пользовательских данных и вывод на экран View

        Controller controller = new Controller(new ModelCheck(), new View());
        controller.run();
    }
}