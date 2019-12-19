package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngineeringDep extends AppCompatActivity {

    Button cse,eee,physics,mathematics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_dep);

        cse=findViewById(R.id.cse);
        eee=findViewById(R.id.eee);
        physics=findViewById(R.id.physics);
        mathematics=findViewById(R.id.mathematics);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EngineeringDep.this,CSEdepartment.class);
                startActivity(intent);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EngineeringDep.this,EEEdepartment.class);
                startActivity(intent);
            }
        });physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EngineeringDep.this,Physicsdepartment.class);
                startActivity(intent);
            }
        });mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EngineeringDep.this,Mathematicsdepartment.class);
                startActivity(intent);
            }
        });
        

    }
}
