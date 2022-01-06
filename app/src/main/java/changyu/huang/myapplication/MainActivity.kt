package changyu.huang.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import changyu.huang.myapplication.rxjava.core.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ObservableCreate(object : ObservableOnSubscribe<Any> {
            override fun subscribe(emitter: Emitter<Any>) {
                emitter.onNext("aaa")
                emitter.onError(Throwable())
                emitter.onComplete()
            }
        }).subscribe(object : Observer<Any> {
            override fun onSubscribe() {
                Log.i(TAG, "onSubscribe")
            }

            override fun onNext(t: Any) {
                Log.i(TAG, "onNext = $t")
            }

            override fun onComplete() {
                Log.i(TAG, "onComplete")
            }

            override fun onError(throwable: Throwable) {
                Log.i(TAG, "onError = $throwable")
            }

        })
    }

    companion object {
        const val TAG = "RXJAVA"
    }

}