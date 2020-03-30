package com.example.loftmoney.screens.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.loftmoney.R;
import com.example.loftmoney.screens.second.BudgetFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container, new BudgetFragment());
        transaction.commit();

        TabLayout tabLayout = findViewById(R.id.tabMaintabs);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.expences));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.income));

    }

}
