package javaConcepts;

@java.lang.FunctionalInterface
interface square{
    int calculate(int x);
    default void printString(String str){
        System.out.println(str);
    }
}
public class FunctionalInterface implements  square{
    @Override
    public int calculate(int x) {
        System.out.println(x * x);
        return x * x;
    }

    public static void main(String[] args) {
        FunctionalInterface obj = new FunctionalInterface();
        obj.calculate(5);
        obj.printString("abc");
    }
}
