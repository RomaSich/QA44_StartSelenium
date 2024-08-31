package practice;

public class Exceptions {
    public static void main(String[] args) {
//method1();
       uncheckableException(2, 0);
        System.out.println("=================");
        try {
            first();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void first() throws InterruptedException {
        second();
    }
    public static void second() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void method1(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }finally {
            System.out.println("==================");
        }
    }
    public static void uncheckableException(int a, int b)
    {
        int res;
        try {
            res = a/b;
        }
        catch (ArithmeticException exception)
        {
            res = 0;
            System.out.println("create exception");
        }
        System.out.println(res);
    }
}
