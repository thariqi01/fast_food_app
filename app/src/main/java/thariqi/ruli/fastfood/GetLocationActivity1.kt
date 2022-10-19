package thariqi.ruli.fastfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GetLocationActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_location1)

        supportActionBar?.hide()

        val searchLocationEditText = findViewById<EditText>(R.id.searchLocationEditText)
        val getLocationBtn = findViewById<Button>(R.id.getLocationBtn)

        searchLocationEditText.setOnClickListener{
            val intent = Intent(this@GetLocationActivity1, GetLocationActivity2::class.java)
            startActivity(intent)
        }
        getLocationBtn.setOnClickListener{
            val intentLoader = Intent(this@GetLocationActivity1, GetLocationActivity3::class.java)
            startActivity(intentLoader)
        }

    }
}