package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.viewHolder> {

    private static RecyclerContactAdapter.viewHolder viewHolder;
    Context context;
    ArrayList<ContactModel> arrayList;
    RecyclerContactAdapter(Context context,ArrayList<ContactModel> arrayList)
    {
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view =LayoutInflater.from(context).inflate(R.layout.item_views,parent,false);
        RecyclerView.ViewHolder viewHolder = new viewHolder(view);
       return RecyclerContactAdapter.viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).imageView);

        holder.name.setText(arrayList.get(position).name);
        holder.about.setText(arrayList.get(position).about);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView name,about;
        ImageView imageView;

        public viewHolder(View view){
            super(view);
            name=view.findViewById(R.id.txt_view_name);
            about=view.findViewById(R.id.txt_view_about);
            imageView=view.findViewById(R.id.img);

        }

    }
}
