package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password1)

        supportActionBar?.hide()

        val buttonSendOTP = findViewById<Button>(R.id.buttonSendOTP)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        buttonSendOTP.setOnClickListener{
            val intent = Intent(this@ForgotPasswordActivity1, ForgotPasswordActivity2::class.java)
            startActivity(intent)
        }

        buttonBack.setOnClickListener{
            val intentBack = Intent(this@ForgotPasswordActivity1, LoginRegisterActivity::class.java)
            startActivity(intentBack)
        }
    }
}