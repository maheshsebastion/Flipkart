package com.example.admin.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 02-08-2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    private ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();
    Context ctx;

    public RecyclerAdapter(ArrayList<Dataprovider> arrayList, Context ctx)
    {
        this.arrayList = arrayList;
        this.ctx = ctx;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view,ctx,arrayList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        Dataprovider dataprovider=arrayList.get(position);
        holder.image.setImageResource(dataprovider.getImg_res());
        holder.m_name.setText(dataprovider.getM_name());
        holder.amount.setText(dataprovider.getAmount());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView image,image1,image2,image3,image4;
        TextView m_name,amount,offer;
        ArrayList<Dataprovider> dataproviders = new ArrayList<Dataprovider>();
        Context ctx;

        public RecyclerViewHolder(View view,Context ctx,ArrayList<Dataprovider> dataproviders)
        {
            super(view);
            this.dataproviders=dataproviders;
            this.ctx=ctx;
            view.setOnClickListener(this);
            image=(ImageView) view.findViewById(R.id.img);
            image1=(ImageView) view.findViewById(R.id.imageView1);
            image2=(ImageView) view.findViewById(R.id.imageView2);
            image3=(ImageView) view.findViewById(R.id.imageView3);
            image4=(ImageView) view.findViewById(R.id.imageView4);
            m_name=(TextView) view.findViewById(R.id.m_name);
            amount=(TextView) view.findViewById(R.id.amount);
            offer=(TextView) view.findViewById(R.id.txt2);

        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Dataprovider dataprovider=this.dataproviders.get(position);
            Intent intent = new Intent(ctx,ProductDetails.class);
            intent.putExtra("img_id",dataprovider.getImg_res());
            intent.putExtra("image1",dataprovider.getImage1());
            intent.putExtra("image2",dataprovider.getImage2());
            intent.putExtra("image3",dataprovider.getImage3());
            intent.putExtra("image4",dataprovider.getImage4());
            intent.putExtra("name",dataprovider.getM_name());
            intent.putExtra("amount",dataprovider.getAmount());
            intent.putExtra("offer",dataprovider.getOffer());
            this.ctx.startActivity(intent);

        }
    }
}
