package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEEdepartment extends AppCompatActivity {

    Button eeechairman,eeewebsite,eeefacebook,eeevideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eeedepartment);

        eeechairman=findViewById(R.id.eeechairman);
        eeewebsite=findViewById(R.id.eeewebsite);
        eeefacebook=findViewById(R.id.eeefacebook);
        eeevideo=findViewById(R.id.eeevideo);

        eeechairman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EEEdepartment.this,EEEchairman.class);
                startActivity(intent);
            }
        });
        eeefacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EEEdepartment.this,EEEfacebook.class);
                startActivity(intent);
            }
        });
        eeewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EEEdepartment.this,EEEwebsite.class);
                startActivity(intent);
            }
        });
        eeevideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EEEdepartment.this,EEEvideo.class);
                startActivity(intent);
            }
        });
    }
}
