package P07_test;

public class C01_MyClass {
    private static final C01_MyClass instance = new C01_MyClass();

    public static C01_MyClass getInstance(){
        return instance;
    }

    public int division(int a, int b){
        if(b==0)
            throw new ArithmeticException("Division by zero");
        return a/b;
    }

    public int multiply(int a, int b){
        return a*b;
    }
}
