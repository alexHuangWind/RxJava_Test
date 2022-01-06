package changyu.huang.myapplication.rxjava.core

interface Observer<T> {
    fun onSubscribe()
    fun onNext(t: T)
    fun onComplete()
    fun onError(throwable: Throwable)
}