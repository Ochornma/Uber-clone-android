package com.shopmax.uberclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Completable.timer(3, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).subscribe {
            Toast.makeText(this, "splash ended", Toast.LENGTH_SHORT).show()
            println("splash ended")
        }
    }
}