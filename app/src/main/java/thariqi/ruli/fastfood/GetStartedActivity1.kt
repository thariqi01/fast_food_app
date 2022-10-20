package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GetStartedActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started1)

        supportActionBar?.hide()

        val nextPageBtn = findViewById<Button>(R.id.getStartedBtn1)

        nextPageBtn.setOnClickListener{
            val intent = Intent(this@GetStartedActivity1, GetStartedActivity2::class.java)
            startActivity(intent)
        }

    }

}














