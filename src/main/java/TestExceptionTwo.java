public class TestExceptionTwo {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println(e +" Делить на нуль - нельзя!");
        }
        System.out.println("Программа работает успешно!");
    }
}