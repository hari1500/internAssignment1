package com.example.assignment1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    TextView textView;
    final int LAUNCH_SECOND_ACTIVITY = 1;
    String result = "Result: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        textView = findViewById(R.id.textViewResult);
        textView.setText(result);
    }

    public void onClickLaunchSecondActivityButton(View v) {
        Intent intent = new Intent(Activity1.this, Activity2.class);
        startActivityForResult(intent, LAUNCH_SECOND_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == LAUNCH_SECOND_ACTIVITY) {
            if(resultCode == Activity.RESULT_OK && data != null)
                result = "Result: "+data.getStringExtra("result");
            else
                result = "Result: ";

            textView.setText(result);
        }
    }
}
