package com.example.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button resultButton;
    private EditText editText;
    private EditText phoneNumberEditText;
    private EditText emailEditText;
    private EditText personNameEditText;
    private EditText passwordNumberEditText;
    private TextView showResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultButton = findViewById(R.id.second_button);
        editText = findViewById(R.id.text_edit_text);
        phoneNumberEditText = findViewById(R.id.phone_number_edit_text);
        emailEditText = findViewById(R.id.email_edit_text);
        personNameEditText = findViewById(R.id.person_name_edit_text);
        passwordNumberEditText = findViewById(R.id.password_number_edit_text);
        showResultTextView = findViewById(R.id.show_result_text_view);

        resultButton.setOnClickListener(v -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder
                    .append(editText.getText().toString())
                    .append("\n");
            stringBuilder
                    .append("Ваш номер телефона: ")
                    .append(phoneNumberEditText.getText().toString())
                    .append("\n");
            stringBuilder
                    .append("Ваш почтовый ящик: ")
                    .append(emailEditText.getText().toString())
                    .append("\n");
            stringBuilder
                    .append("Ваше имя: ")
                    .append(personNameEditText.getText().toString())
                    .append("\n");
            stringBuilder
                    .append("Ваш пароль: ")
                    .append(passwordNumberEditText.getText().toString());

            showResultTextView.setText(stringBuilder);
        });
    }


}