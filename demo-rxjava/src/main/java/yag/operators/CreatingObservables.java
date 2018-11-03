package yag.operators;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class CreatingObservables {

    public void createDemo(){
        Observable
                // 使用Create运算符从头开始创建Observable
                .create((ObservableOnSubscribe<Integer>) e -> {
                    // 发射信息
                    e.onNext(1);
                    // 发送异常信息
//                    e.onError(Throwable throwable);
                    // 发送结束信号
                    e.onComplete();
                    // 结束后信息可继续发送, 但不会被接收
                    e.onNext(2);
                })
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable disposable) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println(integer);
                    }

                    @Override
                    public void onError(Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {
                        System.out.println("结束了");
                    }
                });
    }

//
//    public void deferDemo(){
//        Observable
//                // 在观察者订阅之前不要创建Observable，并为每个观察者创建一个新的Observable
//                // defer 就相当于懒加载，只有等observable 与observer建立了订阅关系时，observable才会建立
//                .defer(new Callable<ObservableSource<?>>() {
//
//                    @Override
//                    public ObservableSource<?> call() throws Exception {
//                        return null;
//                    }
//                })
//    }


}
