package com.example.loftmoney.screens.second;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.loftmoney.R;
import com.example.loftmoney.screens.main.adapter.ChargeModel;

public class AddItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        final EditText textName = findViewById(R.id.textAddItemName);
        final EditText textValue = findViewById(R.id.textAddItemValue);
        Button buttonAdd = findViewById(R.id.BtnAddActivityAdd);

        final String currency = getResources().getString(R.string.currency);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textName.getText().toString();
                String value = textValue.getText().toString();

                if(TextUtils.isEmpty(name) || TextUtils.isEmpty(value)) {
                    return;
                }

                String valueString = value + "" + currency;
                ChargeModel chargeModel = new ChargeModel(name, valueString);

                Intent intent = new Intent();
                intent.putExtra(chargeModel.KEY_NAME, chargeModel);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
