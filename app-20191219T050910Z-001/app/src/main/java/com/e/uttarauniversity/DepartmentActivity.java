package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepartmentActivity extends AppCompatActivity  {

    Button business, engineering, arts, textile, education;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        business = findViewById(R.id.depbusiness);
        engineering = findViewById(R.id.depengineering);
        arts = findViewById(R.id.departs);
        textile = findViewById(R.id.deptextile);
        education = findViewById(R.id.depeducation);


        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentActivity.this,BusinessDep.class);
                startActivity(intent);
            }
        });
        engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentActivity.this,EngineeringDep.class);
                startActivity(intent);
            }
        });
        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentActivity.this,ArtsDep.class);
                startActivity(intent);
            }
        });
        textile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentActivity.this,TextileDep.class);
                startActivity(intent);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DepartmentActivity.this,EducationDep.class);
                startActivity(intent);
            }
        });

    }
}
