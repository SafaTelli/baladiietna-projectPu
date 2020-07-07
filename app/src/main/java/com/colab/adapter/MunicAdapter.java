package com.colab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.colab.baladiyetna.R;

import java.util.ArrayList;

public class MunicAdapter extends RecyclerView.Adapter<MunicAdapter.ViewHolder> {



    ArrayList<String> listMun ;
    Context context ;
    private MunicAdapter.onClickListener listener;



    public MunicAdapter(ArrayList<String> listMun, Context context, MunicAdapter.onClickListener listener)
    {
        this.context =context ;
        this.listMun = listMun ;
        this.listener = listener ;

    }

    @NonNull
    @Override
    public MunicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MunicAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row_mun, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {


        holder.textTitleGv.setText(listMun.get(position));




        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.layout.setBackgroundResource(R.color.colorPrimary);
                listener.itemClicked(position,listMun.get(position));
            }
        });

    }


    @Override
    public int getItemCount() {
        return listMun.size();
    }

    public class ViewHolder  extends  RecyclerView.ViewHolder{

        TextView textTitleGv  =itemView.findViewById(R.id.titleMun);
        CardView cardView  =itemView.findViewById(R.id.cardView);
        RelativeLayout layout  =itemView.findViewById(R.id.layout);
        View viewActive  =itemView.findViewById(R.id.viewActive);
        ImageView imgLogo = itemView.findViewById(R.id.logoMun) ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


    public interface onClickListener
    {
        void itemClicked(int position, String municipality);

    }

}