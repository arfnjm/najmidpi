package com.example.najmidpi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ShowUserProfile extends AppCompatActivity {
Button btn_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user_profile);
        init();
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), EditUserProfile.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        btn_edit=findViewById(R.id.show_user_profile_btnedit);
    }
}