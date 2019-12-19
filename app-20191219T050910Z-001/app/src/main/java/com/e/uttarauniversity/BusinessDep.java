package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessDep extends AppCompatActivity {

    Button chairman,website,facebook,videogallary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_dep);

        chairman=findViewById(R.id.businesschariman);
        website=findViewById(R.id.businesswebsite);
        facebook=findViewById(R.id.businessfacebook);
        videogallary=findViewById(R.id.businessvideo);

        chairman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BusinessDep.this,BusniessChairman.class);
                startActivity(intent);
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BusinessDep.this,Busniesswebsite.class);
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BusinessDep.this,Busniessfacebook.class);
                startActivity(intent);
            }
        });
        videogallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BusinessDep.this,Busniessvideogallary.class);
                startActivity(intent);
            }
        });

    }
}
