package yag.observables;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class HelloObservable {

    public void helloObservable(){

        // 代码这样排个人觉得会直观一些.

        // 初始化Observable
        Observable
                // create()操作符: 通过以编程方式调用observer方法从头开始创建一个Observable
                .create((ObservableOnSubscribe<Integer>) observableEmitter -> {
                    //observableEmitter: 发射器
                    Integer i = 0;
                    while ( i < 7){
                        i++;
                        observableEmitter.onNext(i);
                    }
                })


                // subscribe()操作符: 根据Observable的发射和通知进行操作
                .subscribe(new Observer<Integer>() {  // Observer 就是观察者

                    private Disposable mDisposable;

                    @Override
                    public void onSubscribe(Disposable disposable) {
                        mDisposable = disposable;
                    }

                    @Override
                    public void onNext(Integer i) {
                        if (i == 5){
                            // mDisposable可以切断操作, 让Observer不再接收信息.
                            mDisposable.dispose();
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