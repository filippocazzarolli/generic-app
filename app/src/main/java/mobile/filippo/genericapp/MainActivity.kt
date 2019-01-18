package mobile.filippo.genericapp

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initAnimation()
        initButton()

        window.allowEnterTransitionOverlap = false
    }

    private fun initButton() {

        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        finishAfterTransition()
        return true
//        return super.onSupportNavigateUp()
    }

    private fun initAnimation() {
//        val enterTransition = TransitionInflater.from(this).inflateTransition(R.transition.explode)
//        window.enterTransition = enterTransition


        val myAnim1 = AnimationUtils.loadAnimation(this, R.anim.slide_in_up)
        val myAnim2 = AnimationUtils.loadAnimation(this, R.anim.slide_in_up)
        val myAnim3 = AnimationUtils.loadAnimation(this, R.anim.slide_in_up)
        val myAnim4 = AnimationUtils.loadAnimation(this, R.anim.slide_in_up)
        btnProfile.startAnimation(myAnim1)
        myAnim2.startOffset = 200
        btnCard.startAnimation(myAnim2)
        myAnim3.startOffset = 400
        btnContact.startAnimation(myAnim3)
        myAnim4.startOffset = 600
        btnNews.startAnimation(myAnim4)
    }
}
