package com.example.simon.dagsbeviser;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfirmBevis extends Fragment {


    public ConfirmBevis() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_confirm_bevis, container, false);
        android.widget.Button button_cancel = (android.widget.Button) rootView.findViewById(R.id.cancel_button);
        android.widget.Button button_confirm = (android.widget.Button) rootView.findViewById(R.id.confirm_button);

        button_cancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        android.content.Intent intent = new android.content.Intent(getActivity(), MainActivity.class);
                        MainActivity.FragShow = 0;
                        startActivity(intent);
                    }
                });
        button_confirm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        android.content.Intent intent = new android.content.Intent(getActivity(), FinalTransaction.class);
                        startActivity(intent);
                    }
                });
        return rootView;
    }

}
