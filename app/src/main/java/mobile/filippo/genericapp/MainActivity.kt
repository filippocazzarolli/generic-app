package mobile.filippo.genericapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Transition
import android.transition.TransitionInflater
import android.view.Window

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initAnimation()

        window.allowEnterTransitionOverlap  = false
    }

    override fun onSupportNavigateUp(): Boolean {
        finishAfterTransition()
        return true
//        return super.onSupportNavigateUp()
    }

    private fun initAnimation() {
        val enterTransition = TransitionInflater.from(this).inflateTransition(R.transition.explode)
        window.enterTransition = enterTransition
    }
}
