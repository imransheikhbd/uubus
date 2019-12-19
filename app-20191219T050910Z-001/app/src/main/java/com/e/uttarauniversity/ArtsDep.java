package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtsDep extends AppCompatActivity {

    Button englishdep,lawdep,bangladep,islamicstudies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts_dep);

        englishdep=findViewById(R.id.englishdep);
        lawdep=findViewById(R.id.lawdep);
        bangladep=findViewById(R.id.bangladep);
        islamicstudies=findViewById(R.id.islamicstudies);

        englishdep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ArtsDep.this,EnglishDep.class);
                startActivity(intent);
            }
        });
        lawdep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ArtsDep.this,LawDep.class);
                startActivity(intent);
            }

        });
        bangladep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ArtsDep.this,BanglaDep.class);
                startActivity(intent);
            }
        });
        islamicstudies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ArtsDep.this,Islamicstudiesdep.class);
                startActivity(intent);
            }
        });
    }
}
