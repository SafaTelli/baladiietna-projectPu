package com.colab.baladiyetna.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.colab.adapter.GovAdapter;
import com.colab.adapter.MunicAdapter;
import com.colab.baladiyetna.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SgnUpMunStep2Fragment extends Fragment implements MunicAdapter.onClickListener {


    ArrayList<String> listGov = new ArrayList<>() ;
    public SgnUpMunStep2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sgn_up_mun_step2, container, false);
        listGov.add("المرسى\t") ;
        listGov.add("قرطاج") ;
        listGov.add("سيدي بوسيعد\t") ;
        listGov.add("الكرم") ;
        listGov.add("باردو\t") ;
        listGov.add("تونس\t") ;
        listGov.add("سيدي حسين\t") ;


        RecyclerView recyclerView =  view.findViewById(R.id.listMun) ;

        MunicAdapter adapter = new MunicAdapter(listGov,getActivity(),this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        return  view ;
    }

    @Override
    public void itemClicked(int position, String municipality) {

    }
}
