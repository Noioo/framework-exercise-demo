package yag.observables;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;

public class HelloSingle {

    public void helloSingle(){
        Single
                .create((SingleOnSubscribe<Integer>) singleEmitter -> {
                    // 发射
                    singleEmitter.onSuccess(1);
                    singleEmitter.onSuccess(2);
                })
                .subscribe(new SingleObserver<Integer>() {
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
                });
    }
}