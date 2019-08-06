package LLambdas;

import java.lang.annotation.Annotation;

@FunctionalInterface
interface FuncInterface {
    // An abstract function
    void abstractFuncvsdvsdjfsdf(int x);

}

class Test {
    public static void main(String args[]) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2 * x);


        FuncInterface objf = x -> System.out.println(2 * x);
        // This calls above lambda expression and prints 10.
        fobj.abstractFuncvsdvsdjfsdf(5);

        println((int a ) -> "Hello");

        println((int a) -> "This is my method");
    }

    private static void println(TestInterface o) {
    }


}

interface TestInterface{
    String sdfsdjhfjsdfdsdfgasdfsdfsdf(int a);
}

/**
 *  java/koltin  ->  javabytecode -> trasforms(proguard) ->  dx   ->dex
 *  D8 - javabyte - dex code, R8 - progaurd.
 *
 * 
 */

/*
  lambda operator -> body
  <p>
  SAM - single abstract method
  Anonymous classes
  Higher Order Function - Collection operations changed from java8
 */


/*
    Later: Exercise
    Interesting to read :
        How Android achieves latest java features in old sdk's devices
 */

//javabyte - dalvik byte code. dx - transforms - desugaring