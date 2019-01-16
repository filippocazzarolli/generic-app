package mobile.filippo.genericapp

import android.content.Intent
import android.os.Bundle
import android.transition.TransitionInflater
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        initAnimation()
        initButton()

        window.allowEnterTransitionOverlap = false
    }

    private fun initButton() {

        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }

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
