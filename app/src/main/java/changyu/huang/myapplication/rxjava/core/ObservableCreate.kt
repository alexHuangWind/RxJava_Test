package changyu.huang.myapplication.rxjava.core

class ObservableCreate<T>(private var source: ObservableOnSubscribe<T>) : Observable<T>() {
    override fun subscribeActual(observer: Observer<T>) {
        observer.onSubscribe()
        source.subscribe(CreateEmitter<T>(observer))
    }

    companion object {
        class CreateEmitter<T>(private var observer: Observer<T>) : Emitter<T> {
            var done: Boolean = false

            override fun onNext(t: T) {
                if (done) return
                observer.onNext(t)

            }

            override fun onComplete() {
                if (done) return
                observer.onComplete()
                done = true
            }

            override fun onError(throwable: Throwable) {
                if (done) return
                observer.onError(throwable)
                done = true
            }
        }

    }
}