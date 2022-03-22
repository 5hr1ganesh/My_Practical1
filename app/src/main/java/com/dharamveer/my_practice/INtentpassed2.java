package com.dharamveer.my_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dharamveer.my_practice.databinding.ActivityIntentpassed2Binding;

public class INtentpassed2 extends AppCompatActivity {
    Bundle extras;
    String text = "";

    ActivityIntentpassed2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityIntentpassed2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


            extras = getIntent().getExtras();
            if (extras != null){
                binding.txtMessage.setText("Welcome" +extras.getString("username", ""));
            }
        }

    }
