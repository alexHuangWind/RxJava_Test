package changyu.huang.myapplication.rxjava.core

interface ObservableSource<T> {
    fun subscribe(observer: Observer<T>)
}