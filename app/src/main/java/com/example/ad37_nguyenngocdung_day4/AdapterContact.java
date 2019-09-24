package com.example.ad37_nguyenngocdung_day4;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {

    List<ContactHistory> contactHistoryList;

    public AdapterContact(List<ContactHistory> contactHistoryList) {
        this.contactHistoryList = contactHistoryList;
    }

    @Override
    public int getCount() {
        return contactHistoryList.size();
    }

    @Override
    public Object getItem(int i) {
        return contactHistoryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        view = inflater.inflate(R.layout.item_contact, viewGroup, false);

        ImageView imgStatus = view.findViewById(R.id.imgStatus);
        TextView tvNumber = view.findViewById(R.id.tvNumber);
        TextView tvCountry = view.findViewById(R.id.tvCountry);
        TextView tvDate = view.findViewById((R.id.tvDate));
        ImageView imgMoreInfo = view.findViewById(R.id.imgMoreInfo);

        ContactHistory contactHistory = contactHistoryList.get(i);

        if(contactHistory.getName().equals("")){
            tvNumber.setText(contactHistory.getNumber());
        } else if (!contactHistory.getName().equals(isEmpty())){
            tvNumber.setText(contactHistory.getName());
        }

        tvCountry.setText(contactHistory.getCountry());
        tvDate.setText(contactHistory.getDate());

        if (contactHistory.isImg().equals("incomingCall")) {
            imgStatus.setImageResource(R.drawable.incoming_call2);
        } else if (contactHistory.isImg().equals("outgoingCall")) {
            imgStatus.setImageResource(R.drawable.outgoing_call2);
        } else if (contactHistory.isImg().equals("missedCall")) {
            tvNumber.setTextColor(viewGroup.getContext().getResources().getColor(R.color.colorRed));
        }

        return view;
    }
}
