package yag.observables;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

public class HelloCompletable {

    public void helloCompletable(){
        Completable
                .create(completableEmitter -> completableEmitter.onComplete())
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onComplete() {
                        System.out.println("执行完成");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });
    }
}