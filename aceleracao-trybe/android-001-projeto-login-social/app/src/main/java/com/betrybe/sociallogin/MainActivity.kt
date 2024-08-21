package com.betrybe.sociallogin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    // Tem que pegar o ID do TextInputEditText e não do TextInputLayout
    private val emailLayout: TextInputLayout by lazy { findViewById(R.id.email_text_input_layout) }
    private val email: TextInputEditText by lazy { findViewById(R.id.email_text) }
    private val passwordLayout: TextInputLayout by lazy { findViewById(R.id.password_text_input_layout) }
    private val password: TextInputEditText by lazy { findViewById(R.id.password_text) }
    private val login: Button by lazy { findViewById(R.id.login_button) }
    private val forgotPassword: Button by lazy { findViewById(R.id.forgot_password_button) }
    private val signup: Button by lazy { findViewById(R.id.sign_up_button) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listenerTextInputEditText()
        login.setOnClickListener {
            if (layoutValidationEmail() && layoutValidationPassword()) {
                Snackbar.make(
                    findViewById(R.id.main), "Login efetuado com sucesso", Snackbar.LENGTH_LONG).show()
            }
        }

        forgotPassword.setOnClickListener {
            Snackbar.make(findViewById(R.id.main), "Não implementado", Snackbar.LENGTH_LONG).show()
        }

        signup.setOnClickListener {
            Snackbar.make(findViewById(R.id.main), "Não implementado", Snackbar.LENGTH_LONG).show()
        }
    }

    private fun listenerTextInputEditText() {
        // Fazer Listener dos 2 campos trigando a função que muda status do botão
        email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                updateLoginButtonState()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        password.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                updateLoginButtonState()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
    private fun updateLoginButtonState() {
        val emailInput = email.text.toString()
        val passwordInput = password.text.toString()
        // A regra de negócio é que ambos precisam ter pelo menos 1 caracter
        login.isEnabled = emailInput.isNotEmpty() && passwordInput.isNotEmpty()
    }

    private fun layoutValidationEmail(): Boolean {
        val matcher = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\$")
            .matcher(email.text.toString())
        val isValid = matcher.matches()
        if (!isValid) {
            emailLayout.error = "Email inválido"
            emailLayout.isErrorEnabled = true
            // Só esses 2 já mudam cor da borda, label, aparece ícone à direita e texto abaixo
            emailLayout.setStartIconTintList(getColorStateList(R.color.red)) // Ícone à esquerda
        } else {
            emailLayout.error = ""
            emailLayout.isErrorEnabled = false
            emailLayout.setStartIconTintList(null)
        }

        return isValid
    }

    private fun layoutValidationPassword(): Boolean {
        val isValid = password.text.toString().length > 4
        if (!isValid) {
            passwordLayout.error = "Senha deve ter mais de 4 caracteres"
            passwordLayout.isErrorEnabled = true
            passwordLayout.setStartIconTintList(getColorStateList(R.color.red))
        } else {
            passwordLayout.error = ""
            passwordLayout.isErrorEnabled = false
            passwordLayout.setStartIconTintList(null)
        }

        return isValid
    }
}
