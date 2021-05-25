import java.io.FileWriter;
import java.io.IOException;

public class TestExceptionOne {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("Logger.txt");
            fileWriter.close();
            fileWriter.write("Hello World");
        } catch (IOException e) {
            System.out.println(e+" - Ошибка - Нельзя записать в закрытый файл!");
        }finally {
            System.out.println("Выполняюсь всегда!");
        }
        System.out.println("Программа работает успешно!");
    }
}