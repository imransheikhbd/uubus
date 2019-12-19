package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gallary extends AppCompatActivity {

    Button convocation,oldalbum,newalbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallary);
        convocation=findViewById(R.id.convocation);
        oldalbum=findViewById(R.id.oldalbum);
        newalbum=findViewById(R.id.newalbum);

        convocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Gallary.this,ConvocationActivity.class);
                startActivity(intent);
            }
        });
        oldalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Gallary.this,OldalbumActivity.class);
                startActivity(intent);
            }
        });

        newalbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Gallary.this,NewalbumActivity.class);
                startActivity(intent);
            }
        });


    }
}
