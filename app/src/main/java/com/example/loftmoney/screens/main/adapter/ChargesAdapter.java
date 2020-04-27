package com.example.loftmoney.screens.main.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loftmoney.R;

import java.util.ArrayList;
import java.util.List;

public class ChargesAdapter extends RecyclerView.Adapter<ChargesAdapter.ChargesViewHolder> {

    private List<ChargeModel> mDataList = new ArrayList<>();

    public List<ChargeModel> getData() {
        return mDataList;
    }

    public void setData(List<ChargeModel> newList) {
        this.mDataList = newList;
    }

    public void setNewData(List<ChargeModel> newData) {
        mDataList.clear();
        mDataList.addAll(newData);
        notifyDataSetChanged();
    }

    public void addDataToTop(ChargeModel model) {
        mDataList.add(0,model);
        notifyItemInserted(0);

    }

    @NonNull
    @Override
    public ChargesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ChargesViewHolder(layoutInflater.inflate(R.layout.cell_charge, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChargesViewHolder holder, int position) {
        holder.bind(mDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    static class ChargesViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName = itemView.findViewById(R.id.txtChargeName);
        private TextView txtValue = itemView.findViewById(R.id.txtChargeValue);


        ChargesViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(ChargeModel chargeModel) {
            txtName.setText(chargeModel.getName());
            txtValue.setText(chargeModel.getValue());

        }

    }
}
