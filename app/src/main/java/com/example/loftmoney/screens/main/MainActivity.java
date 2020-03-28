package com.example.loftmoney.screens.main;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.loftmoney.screens.main.adapter.ChargeModel;
import com.example.loftmoney.screens.main.adapter.ChargesAdapter;
import com.example.loftmoney.screens.second.AddItemActivity;
import com.example.loftmoney.R;

public class MainActivity extends AppCompatActivity {

    private ChargesAdapter chargesAdapter = new ChargesAdapter();
    static  int ADD_ITEM_REQUEST;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerMain);
        recyclerView.setAdapter(chargesAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        findViewById(R.id.fabMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(getApplicationContext(), AddItemActivity.class);
                startActivityForResult(secondIntent, ADD_ITEM_REQUEST);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ADD_ITEM_REQUEST && resultCode == RESULT_OK && data != null) {
            ChargeModel chargeModel = (ChargeModel) data.getSerializableExtra(ChargeModel.KEY_NAME);
            chargesAdapter.addDataToTop(chargeModel);
        }
    }
}
