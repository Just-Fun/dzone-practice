package serzh.com.override;

/**
 * @author sergii.zagryvyi on 26.03.2018
 */
public class Foo {

//    @Override
    public boolean equals(Foo foo) {
        // Check if the supplied object is equal to this object
        return true;
    }


    @Override
    public boolean equals(Object o) {
        return true;
    }


}
