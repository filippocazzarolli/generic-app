package mobile.filippo.genericapp

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//        initAnimation()
    }

    private fun initAnimation() {
        val enterTransition = TransitionInflater.from(this).inflateTransition(R.transition.explode)
        window.enterTransition = enterTransition
    }

}
