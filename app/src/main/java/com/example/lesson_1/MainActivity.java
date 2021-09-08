package com.example.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText text;
    private EditText phoneNumber;
    private EditText email;
    private EditText personName;
    private EditText passwordNumber;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.second_button);
        text = findViewById(R.id.text_edit_text);
        phoneNumber = findViewById(R.id.phoneNumber_edit_text);
        email = findViewById(R.id.email_edit_text);
        personName = findViewById(R.id.personName_edit_text);
        passwordNumber = findViewById(R.id.passwordNumber_edit_text);
        textView = findViewById(R.id.show_result_TV);

        button.setOnClickListener(v -> {
            String msg = "Some text: " + text.getText().toString() + " \n" + "Phone number: " +
                    phoneNumber.getText().toString()
                    + " \n" + "Email address: " + email.getText().toString() + " \n" +
                    "Person name: " + personName.getText().toString() +
                     " \n" + "Your password: " + passwordNumber.getText().toString();
            textView.setText(msg);
        });
    }


}