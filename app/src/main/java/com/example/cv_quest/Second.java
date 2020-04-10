package com.example.cv_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        Toast toast = Toast.makeText(getApplicationContext(),
                "Приобретение продуктов в магазинах" +
                        " В первую очередь необходимо уточнить," +
                        " какие продукты уже есть у вас дома и составить список с учетом рекомендуемых суточных норм потребления. " +
                        "При планировании важно соблюдать принципы сбалансированного рациона питания.",
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button data = findViewById(R.id.data);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(null); Intent i  = new Intent(Second.this, Secondinfo.class);
                startActivity(i);
            }
        });
    }
}
