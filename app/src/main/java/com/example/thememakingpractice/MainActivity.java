package com.example.thememakingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    boolean isTheme1;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        editText = findViewById(R.id.editText1);
        String text = editText.getText().toString();
        isTheme1 = ((ToggleButton)findViewById(R.id.toggleButton)).isChecked();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("THEME", isTheme1);
        intent.putExtra("TEXT", text);
        startActivity(intent);

    }
}