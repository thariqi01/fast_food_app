package thariqi.ruli.fastfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)

        supportActionBar?.hide()

        val loginFragment = LoginFragment()
        val registerFragment = RegisterFragment()

        val loginFragmentBtn = findViewById<Button>(R.id.loginFragmentBtn)
        val registerFragmentBtn = findViewById<Button>(R.id.registerFragmentBtn)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFragment, loginFragment)
            commit()
        }

        loginFragmentBtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFragment, loginFragment)
                commit()
            }
        }

        registerFragmentBtn.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFragment, registerFragment)
                commit()
            }
        }

    }
}