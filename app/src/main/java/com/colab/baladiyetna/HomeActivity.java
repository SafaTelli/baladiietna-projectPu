package com.colab.baladiyetna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {


    CardView cardRec , cardCalendar , cardDemande , cardCom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardRec = findViewById(R.id.rec) ;
        cardCalendar = findViewById(R.id.calend) ;
        cardDemande = findViewById(R.id.demande) ;
        cardCom = findViewById(R.id.com) ;


        cardRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ReclamationActivity.class));

            }
        });

        cardCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, CalendarActivity.class));

            }
        });

        cardDemande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, DemandeActivity.class));

            }
        });

        cardCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, ComityActivity.class));

            }
        });
    }
}
