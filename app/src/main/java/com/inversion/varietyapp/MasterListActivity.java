package com.inversion.varietyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MasterListActivity extends AppCompatActivity {

    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masterlist);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateListActivity.class);
                startActivity(intent);
            }
        });

        text1 = findViewById(R.id.text1);

        Intent receivedIntent = getIntent();
        if (getIntent().getExtras() != null) {
            String primit = receivedIntent.getStringExtra("cheie");
            text1.setText(primit);
            text1.setVisibility(View.VISIBLE);
        }

    }

}
