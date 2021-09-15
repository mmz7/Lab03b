package com.zhangmegan.lab03b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nameLabel;
    EditText nameInput;
    Button button;
    SharedPreferences sP;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameLabel = findViewById(R.id.nameLabel);
        nameInput = findViewById(R.id.nameInput);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameInput.getText().toString();
                sP = getSharedPreferences(name, MODE_PRIVATE);
                editor = sP.edit();

            }
        });
    }
}