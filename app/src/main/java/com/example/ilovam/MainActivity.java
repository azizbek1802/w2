
package com.example.ilovam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // EditText va Button-larni topish
        EditText editText = findViewById(R.id.editText);
        Button buttonToast = findViewById(R.id.buttonToast);
        Button buttonNext = findViewById(R.id.buttonNext);

        // Toast chiqarish tugmasi uchun onClickListener
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });

        // SecondActivity-ga o'tish tugmasi uchun onClickListener
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}


