package thariqi.ruli.fastfood

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GetLocationActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_location2)

        supportActionBar?.hide()

        val locationOption1 = findViewById<TextView>(R.id.locationOption1)

        locationOption1.setOnClickListener{
            val intent = Intent(this@GetLocationActivity2, GetLocationActivity3::class.java)
            startActivity(intent)
        }
    }
}