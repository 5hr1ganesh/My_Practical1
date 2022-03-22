package com.dharamveer.my_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private EditText txtUsername,txtPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.button2);
        txtUsername = findViewById(R.id.editTextTextPersonName2);
        txtPassword = findViewById(R.id.editTextTextPassword2);

        buttonLogin.setOnClickListener(v -> {
            if (txtUsername.getText().toString().isEmpty() || txtPassword.getText().toString().isEmpty()){
                if (txtUsername.getText().toString().isEmpty()) {
                    txtUsername.setError("Username cannot be empty!!!");
                }
                if (txtPassword.getText().toString().isEmpty()) {
                    txtPassword.setError("Password cannot be Empty !!!");
                }
            } else {
                txtUsername.setError(null);
                txtPassword.setError(null);
                Toast.makeText(this, "Login Successful!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}