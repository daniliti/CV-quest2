package com.example.cv_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Covid19 extends AppCompatActivity {

    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        Toast toast = Toast.makeText(getApplicationContext(),
                "С целью профилактики:" +
                        "правильно питайтесь" +
                        "употребляйте достаточное количество витоминов" +
                        "особенно витаминов С",
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid19);
        Button button10 = findViewById(R.id.BTN);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(null); Intent i = new Intent(Covid19.this, Second.class);
                startActivity(i);
            }
        });
    }
}
