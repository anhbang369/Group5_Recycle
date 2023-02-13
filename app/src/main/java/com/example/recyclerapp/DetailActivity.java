package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Bundle bundle = getIntent().getExtras();
        if(bundle ==null){
            return;
        }

        User user = (User) bundle.get("object_user");
        TextView tvNameUser = findViewById(R.id.tv_name_user);
        tvNameUser.setText(user.getName());
    }
}