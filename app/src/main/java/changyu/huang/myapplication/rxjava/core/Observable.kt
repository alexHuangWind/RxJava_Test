package changyu.huang.myapplication.rxjava.core

abstract class Observable<T> : ObservableSource<T> {

    override fun subscribe(observer: Observer<T>) {
        subscribeActual(observer)
    }

    abstract fun subscribeActual(observer: Observer<T>)

}

