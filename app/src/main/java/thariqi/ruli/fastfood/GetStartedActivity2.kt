package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStartedActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started2)

        supportActionBar?.hide()

        val nextPageBtn = findViewById<Button>(R.id.getStartedBtn2)

        nextPageBtn.setOnClickListener{
            val intent = Intent(this@GetStartedActivity2, GetStartedActivity3::class.java)
            startActivity(intent)
        }
    }
}