package yag.observables;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeOnSubscribe;
import io.reactivex.disposables.Disposable;

public class HelloMaybe {

    public void helloMaybe(){
        Maybe
                .create((MaybeOnSubscribe<Integer>) maybeEmitter -> {
                    maybeEmitter.onSuccess(1);
                    maybeEmitter.onComplete();
                })
                .subscribe(new MaybeObserver<Integer>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onSuccess(Integer integer) {
                        System.out.println(integer);
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        throwable.printStackTrace();
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("执行完成");
                    }
                });
    }
}