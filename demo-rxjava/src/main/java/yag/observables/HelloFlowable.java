package yag.observables;

import io.reactivex.*;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class HelloFlowable {

    public void helloFlowable(){
        Flowable
                .create((FlowableOnSubscribe<Integer>) flowableEmitter -> {
                    Integer i = 0;
                    while ( i < 7) {
                        i++;
                        flowableEmitter.onNext(i);
                    }
                }, BackpressureStrategy.ERROR/* 背压 */)

                .subscribe(new Subscriber<Integer>() {

                    private Subscription subscription;
                    @Override
                    public void onSubscribe(Subscription subscription) {
                        subscription.request(Long.MAX_VALUE);
                        this.subscription = subscription;
                    }

                    @Override
                    public void onNext(Integer i) {
                        if (i == 5){
                            // 退出接收
                            subscription.cancel();
                        }else {
                            System.out.println("现在接收到的信号是: 第" + i + "信号");
                        }
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
