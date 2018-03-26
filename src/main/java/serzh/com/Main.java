package serzh.com;

import lombok.extern.slf4j.Slf4j;
import serzh.com.override.Foo;

/**
 * @author sergii.zagryvyi on 26.03.2018
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        Object foo = new Foo();
        Object identicalFoo = new Foo();
        log.info("{}", foo.equals(identicalFoo));
    }

}
