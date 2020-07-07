package com.colab.baladiyetna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.colab.baladiyetna.fragments.SgnUpMunStep2Fragment;
import com.colab.baladiyetna.fragments.SignUpGovStep1Fragment;
import com.colab.baladiyetna.fragments.SignUpInfosStep3Fragment;
import com.colab.baladiyetna.fragments.SignUpInfosStep4Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {


        @BindView(R.id.frameStep)
        FrameLayout viewPager ;


        @BindView(R.id.btnNext)
        Button btnNext ;





        int position = 0 ;

        FragmentManager fragmentManager ;
        FragmentTransaction fragmentTransaction ;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_up);
            ButterKnife.bind(this);
            fragmentManager = getSupportFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.frameStep, new SignUpGovStep1Fragment());
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

            btnNext.setOnClickListener(this);

        }


        @Override
        public void onClick(View view) {

            if( view == btnNext )
            {
                fragmentTransaction = fragmentManager.beginTransaction();

                switch (position)
                {
                    case 0 :
                        fragmentTransaction.replace(R.id.frameStep, new SgnUpMunStep2Fragment());
                        position ++ ;
                        //  imgPrev.setVisibility(View.VISIBLE);


                        break;

                    case 1 :
                        fragmentTransaction.replace(R.id.frameStep, new SignUpInfosStep3Fragment());
                        // imgPrev.setVisibility(View.VISIBLE);
                        position ++ ;
                        break;
                    case 2 :
                        fragmentTransaction.replace(R.id.frameStep, new SignUpInfosStep4Fragment());
                        // imgPrev.setVisibility(View.VISIBLE);
                        btnNext.setText("تسجيل");

                        position ++ ;
                        break;


                }
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
