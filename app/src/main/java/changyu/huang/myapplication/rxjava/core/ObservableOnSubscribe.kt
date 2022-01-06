package changyu.huang.myapplication.rxjava.core

interface ObservableOnSubscribe<T> {
    fun subscribe(emitter: Emitter<T>)
}