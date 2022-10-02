package javaConcepts;

interface Test{
    static void printString(String str){
        System.out.println("Inside interface print method "+str);
    }
    public void overrideMethod();

    public default void defaultMethod(){
        System.out.println("inside default method from 1");
    }
}

interface Test2{
    public void overrideMethod();
    public default void defaultMethod(){
        System.out.println("inside default method from 2");
    }
}
public class InterfaceMethods implements Test, Test2{

    @Override
    public void overrideMethod(){
        System.out.println("insode overriden method");
    }

    @Override
    public void defaultMethod() {
        Test.super.defaultMethod();
        Test2.super.defaultMethod();
    }

    public static void printString(String str){
        Test.printString(str);
        System.out.println("Inside class print method");
    }

    public static void main(String[] args) {
        InterfaceMethods obj = new InterfaceMethods();
        obj.overrideMethod();
        obj.defaultMethod();
        Test.printString("abc");
      //  printString("ayushi");

    }
}
