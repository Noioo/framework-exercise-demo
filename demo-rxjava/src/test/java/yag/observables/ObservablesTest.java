package yag.observables;

import org.testng.annotations.Test;

@Test
public class ObservablesTest {

    public void rxjava(){
        HelloRxJava helloRxJava = new HelloRxJava();
        helloRxJava.hello();
    }

    public void observable(){
        HelloObservable helloObservable = new HelloObservable();
        helloObservable.helloObservable();
    }

    public void flowable(){
        HelloFlowable helloFlowable = new HelloFlowable();
        helloFlowable.helloFlowable();
    }

    public void maybe(){
        HelloMaybe helloMaybe = new HelloMaybe();
        helloMaybe.helloMaybe();
    }

    public void single(){
        HelloSingle helloSingle = new HelloSingle();
        helloSingle.helloSingle();
    }

    public void completable(){
        HelloCompletable helloCompletable = new HelloCompletable();
        helloCompletable.helloCompletable();
    }
}
