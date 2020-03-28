package com.example.loftmoney.screens.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.loftmoney.screens.main.adapter.ChargesAdapter;
import com.example.loftmoney.screens.second.AddItemActivity;
import com.example.loftmoney.R;

public class MainActivity extends AppCompatActivity {

    private ChargesAdapter chargesAdapter = new ChargesAdapter() ;
    static  int ADD_ITEM_REQUEST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fabMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivityForResult(secondIntent, ADD_ITEM_REQUEST);
            }
        });

    }

}
