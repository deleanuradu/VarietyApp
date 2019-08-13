package com.inversion.varietyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateListActivity extends AppCompatActivity {

    EditText title;
    EditText description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_list);

        title = findViewById(R.id.edit_title);
        description = findViewById(R.id.edit_description);
    }

    public void resetFields(View view) {
        title.setText("");
        description.setText("");
    }

    public void savePreferences(View view) {
        String s = title.getText().toString();
        Intent intent = new Intent(this, MasterListActivity.class);
        intent.putExtra("cheie",s);
        startActivity(intent);
    }
}
