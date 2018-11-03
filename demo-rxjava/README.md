# demo-rxjava

> Java: `1.8`
>
> Maven: `3`
>
> RxJava: `2.2.3`


运行基础类: `yag.observables`  
操作符: `yag.operators`

## Observables
一共有5个:
RxJava 2 features several <u>base classes</u> you can discover operators on:

- [`io.reactivex.Flowable`](http://reactivex.io/RxJava/2.x/javadoc/io/reactivex/Flowable.html): 0..N flows, supporting Reactive-Streams and backpressure
- [`io.reactivex.Observable`](http://reactivex.io/RxJava/2.x/javadoc/io/reactivex/Observable.html): 0..N flows, no backpressure,
- [`io.reactivex.Single`](http://reactivex.io/RxJava/2.x/javadoc/io/reactivex/Single.html): a flow of exactly 1 item or an error,
- [`io.reactivex.Completable`](http://reactivex.io/RxJava/2.x/javadoc/io/reactivex/Completable.html): a flow without items but only a completion or error signal,
- [`io.reactivex.Maybe`](http://reactivex.io/RxJava/2.x/javadoc/io/reactivex/Maybe.html): a flow with no items, exactly one item or an error.

背压(backpressure)
背压是指在异步场景中，被观察者发送事件速度远快于观察者的处理速度的情况下，一种告诉上游的被观察者降低发送速度的策略。

> 笔记: 
> - `Observable` - 0...N flows, 但不支持背压. 
> - `Flowable` - 0...N flows, 支持响应式流和背压(backpressure)
> - `Single` - 只发射一条单一的数据，或者一条异常通知, 不能发射完成通知，其中数据与通知只能发射一个。
> - `Compoletable` - 只发射一条完成通知，或者一条异常通知，不能发射数据，其中完成通知与异常通知只能发射一个
> - `Maybe` - 可发射一条单一的数据，以及发射一条完成通知，或者一条异常通知，其中完成通知和异常通知只能发射一个，发射数据只能在发射完成通知或者异常通知之前，否则发射数据无效。

## Operators
