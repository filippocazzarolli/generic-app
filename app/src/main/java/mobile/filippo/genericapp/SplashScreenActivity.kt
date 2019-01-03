package mobile.filippo.genericapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils

import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity(), Animation.AnimationListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        startAnimation()
    }

    private fun startAnimation() {
        val animation = AnimationUtils.loadAnimation(this,  R.anim.splash_screen_logo)
        animation.setAnimationListener(this)
        imageView.startAnimation(animation)
    }


    override fun onAnimationRepeat(animation: Animation?) {
    }

    override fun onAnimationEnd(animation: Animation?) {
        Log.i("XXX", "FINISH")
    }

    override fun onAnimationStart(animation: Animation?) {
        Log.i("XXX", "START")

    }

}
