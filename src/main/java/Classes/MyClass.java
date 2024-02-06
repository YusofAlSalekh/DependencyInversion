package Classes;

/*import Implementations.MyImplementation1;

public class MyClass {
    private MyImplementation1 myImplementation;

    public MyClass(MyImplementation1 myImplementation) {
        this.myImplementation = myImplementation;
    }

    public void execute() {
        myImplementation.doSomething();
    }
}*/

import Implementations.MyInterface;

public class MyClass {
    private MyInterface myInterface;

    public MyClass(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public void execute() {
        myInterface.doSomething();
    }
}
