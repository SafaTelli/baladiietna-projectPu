package com.colab.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.colab.baladiyetna.R;

import java.util.ArrayList;

public class GovAdapter extends RecyclerView.Adapter<GovAdapter.ViewHolder> {



    ArrayList<String> listGov ;
    Context context ;
    private onClickListener listener;



    public GovAdapter(ArrayList<String> listGov, Context context, onClickListener listener)
    {
        this.context =context ;
        this.listGov = listGov ;
        this.listener = listener ;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GovAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_row_gov, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.textTitleGv.setText(listGov.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               holder.layout.setBackgroundResource(R.color.colorPrimary);
                listener.itemClicked(position,listGov.get(position));
            }
        });


    }


    @Override
    public int getItemCount() {
        return listGov.size();
    }

    public class ViewHolder  extends  RecyclerView.ViewHolder{

        TextView textTitleGv  =itemView.findViewById(R.id.titleGov);
        CardView cardView  =itemView.findViewById(R.id.cardView);
        RelativeLayout layout  =itemView.findViewById(R.id.layout);

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


    public interface onClickListener
    {
        void itemClicked(int position, String gov);

    }

}
