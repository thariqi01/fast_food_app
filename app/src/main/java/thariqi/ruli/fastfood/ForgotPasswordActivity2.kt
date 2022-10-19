package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password2)

        supportActionBar?.hide()

        val buttonVerificationOTP = findViewById<Button>(R.id.buttonVerificationOTP)

        buttonVerificationOTP.setOnClickListener{
            val intent = Intent(this@ForgotPasswordActivity2, ForgotPasswordActivity3::class.java)
            startActivity(intent)
        }
    }
}