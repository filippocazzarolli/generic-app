package mobile.filippo.genericapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startAnimation()
    }

    private fun startAnimation() {
//        let amin = AnimationUtils.loadAnimation(this, imageView)
    }
}
