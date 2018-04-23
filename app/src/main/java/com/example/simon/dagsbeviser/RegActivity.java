package com.example.simon.dagsbeviser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        Button regbutton = findViewById(R.id.regbutton);
        regbutton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(RegActivity.this, MainActivity.class);
                        startActivity(intent);
                        MainActivity.FragShow = 1;
                    }
                });

    }


}
