package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class GetLocationActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_location3)

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this@GetLocationActivity3, WelcomeActivity::class.java))
            finish()
        }, 3000)
    }
}