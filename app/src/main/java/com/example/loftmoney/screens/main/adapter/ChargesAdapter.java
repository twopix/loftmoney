package com.example.loftmoney.screens.main.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChargesAdapter extends RecyclerView.Adapter<ChargesAdapter.ChargesViewHolder> {

    private List<ChargeModel> mDataList = new ArrayList<>();

    @NonNull
    @Override
    public ChargesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        return new ChargesViewHolder();
    }

    @Override
    public void onBindViewHolder(@NonNull ChargesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    static class ChargesViewHolder extends RecyclerView.ViewHolder {

        public ChargesViewHolder(@NonNull View itemView) {
            super(itemView);
        }



    }
}
