package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button button;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button = findViewById(R.id.buttonActivitySum);
        editText1 = findViewById(R.id.editTextNumber1);
        editText2 = findViewById(R.id.editTextNumber2);
    }

    public void calculateSum(View v) {
        if (editText1.getText().toString().equals("") || editText2.getText().toString().equals("")) {
            Toast.makeText(Activity2.this, "Please Enter both Numbers!!!", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = getIntent();
            Integer n1 = Integer.parseInt(editText1.getText().toString());
            Integer n2 = Integer.parseInt(editText2.getText().toString());
            intent.putExtra("result", Integer.toString(n1 + n2));
            setResult(Activity.RESULT_OK, intent);
            finish();
        }
    }
}
