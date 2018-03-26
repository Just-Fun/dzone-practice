package serzh.com.functionalinterface;

@FunctionalInterface
public interface Bar {

    public int doSomething();

    public default int doSomethingElse() {
        return 1;
    }

    public default int doSomethingElseMore() {
        return 1;
    }
}
