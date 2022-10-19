package thariqi.ruli.fastfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPasswordActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password3)

        supportActionBar?.hide()

        val buttonChangePassword = findViewById<Button>(R.id.buttonChangePassword)

        buttonChangePassword.setOnClickListener() {
            val intent = Intent(this@ForgotPasswordActivity3, LoginRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}