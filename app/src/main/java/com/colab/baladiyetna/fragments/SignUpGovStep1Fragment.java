package com.colab.baladiyetna.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.colab.adapter.GovAdapter;
import com.colab.baladiyetna.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpGovStep1Fragment extends Fragment implements GovAdapter.onClickListener {



    ProgressBar progressBar ;


    SignUpGovStep1Fragment context ;
    ArrayList<String> listGov = new ArrayList<>() ;

    public SignUpGovStep1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_sign_up_gov_step1, container, false);
        listGov.add("        ولاية أريانة\n") ;
        listGov.add("       ولاية باجة\n") ;
        listGov.add("        ولاية أريانة\n") ;
        listGov.add("       ولاية بن عروس\n") ;
        listGov.add("        ولاية بنزرت\n") ;
        listGov.add("       ولاية جندوبة\n") ;
        listGov.add("       ولاية سوسة\n") ;
        listGov.add("        ولاية سليانة\n") ;
        listGov.add("        ولاية سيدي بوزيد\n\n") ;
        listGov.add("       ولاية القصرين\n") ;
        listGov.add("       ولاية مدنين\n") ;
        RecyclerView recyclerView =  view.findViewById(R.id.listGov) ;

        GovAdapter adapter = new GovAdapter(listGov,getActivity(),this);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);


        /*
        ولاية أريانة
ولاية باجة
ولاية بن عروس
ولاية بنزرت
ولاية تطاوين
ولاية توزر
ولاية تونس
ولاية جندوبة
ولاية زغوان
ولاية سليانة
ولاية سوسة
ولاية سيدي بوزيد
ولاية صفاقس
ولاية قابس
ولاية قبلي
ولاية القصرين
ولاية قفصة
ولاية القيروان
ولاية الكاف
ولاية مدنين
ولاية المنستير
ولاية منوبة
ولاية المهدية
ولاية نابل
         */







        return  view ;
    }


    @Override
    public void itemClicked(int position, String gov) {

    }
}
