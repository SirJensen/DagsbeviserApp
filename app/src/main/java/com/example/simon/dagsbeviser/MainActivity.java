package com.example.simon.dagsbeviser;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static int FragShow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (FragShow == 0){
            setTitle("Køb Dagsbevis");
            BuyBevis buyBevisFragment = new BuyBevis();
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, buyBevisFragment).commit();
        }else{
            setTitle("Køb Dagsbevis");
            ConfirmBevis confirmBevisFragment = new ConfirmBevis();
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.fragment, confirmBevisFragment).commit();
        }


    }
}
