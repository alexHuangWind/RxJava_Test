package changyu.huang.myapplication.rxjava.core

interface Emitter<T> {
    fun onNext(t: T)
    fun onComplete()
    fun onError(throwable: Throwable)
}