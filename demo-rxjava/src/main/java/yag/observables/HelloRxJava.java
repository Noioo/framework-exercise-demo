package yag.observables;

import io.reactivex.Flowable;

public class HelloRxJava {

    public void hello(){
        Flowable
                .just("Hello World")
                .subscribe(System.out::println);
    }
}
