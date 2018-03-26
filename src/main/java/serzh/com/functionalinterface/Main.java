package serzh.com.functionalinterface;

/**
 * @author sergii.zagryvyi on 26.03.2018
 */
public class Main {

    public static void main(String[] args) {

        FunctionalConsumer consumer = new FunctionalConsumer();
        consumer.consumeFoo(() -> 10);    // 10
        consumer.consumeBar(() -> 20);    // 20
    }

}
