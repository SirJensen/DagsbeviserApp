package com.example.simon.dagsbeviser;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BuyBevis extends Fragment {


    public BuyBevis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_buy_bevis, container, false);
        android.widget.LinearLayout CardClick = (android.widget.LinearLayout) rootView.findViewById(R.id.card_clicker);

        CardClick.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), RegActivity.class);
                        startActivity(intent);
                    }
                });
        return rootView;
    }



}
