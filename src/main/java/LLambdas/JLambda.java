package LLambdas;


interface FuncInterface {
    // An abstract function
    void abstractFun(int x);

}

class Test {
    public static void main(String args[]) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2 * x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);

        // println(() -> "Hello");
    }


}


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