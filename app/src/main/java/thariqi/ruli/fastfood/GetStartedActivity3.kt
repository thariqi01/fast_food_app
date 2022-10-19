package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStartedActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started3)

        supportActionBar?.hide()

        val nextPageBtn = findViewById<Button>(R.id.getStartedBtn3)

        nextPageBtn.setOnClickListener{
            val intent = Intent(this@GetStartedActivity3, LoginRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}