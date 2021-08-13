package com.example.nestedrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MemberAdp extends RecyclerView.Adapter<MemberAdp.viewHolder> {
ArrayList<String> arrayListMember;

    public MemberAdp(ArrayList<String> arrayListMember) {
        this.arrayListMember = arrayListMember;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_member,parent,false);
        return new MemberAdp.viewHolder(view); }@Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
holder.textView.setText(arrayListMember.get(position)); }@Override
    public int getItemCount() {
        return arrayListMember.size(); }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text2);
        }
    }
}
