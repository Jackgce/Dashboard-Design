package com.example.lms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cse = (CardView) findViewById(R.id.cse);
        CardView eee = (CardView) findViewById(R.id.eee);
        CardView ece = (CardView) findViewById(R.id.ece);
        CardView civil = (CardView) findViewById(R.id.civil);
        CardView mech = (CardView) findViewById(R.id.mech);

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Csebooks.class);
                startActivity(i);
                finish();
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), eeebooks.class);
                startActivity(i);
                finish();
            }
        });


        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Csebooks.class);
                startActivity(i);
                finish();
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Csebooks.class);
                startActivity(i);
                finish();
            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Csebooks.class);
                startActivity(i);
                finish();
            }
        });
    }

}
