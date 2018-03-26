package serzh.com.functionalinterface;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sergii.zagryvyi on 26.03.2018
 */
@Slf4j
public class FunctionalConsumer {

    public void consumeFoo(Foo foo) {
        log.info("{}", foo.doSomething());
    }

    public void consumeBar(Bar bar) {
        log.info("{}", bar.doSomething());
    }

}
