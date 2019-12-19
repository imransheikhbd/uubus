package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button department,studentportal,gallary,uubus,aboutus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        department=findViewById(R.id.department);
        studentportal=findViewById(R.id.studentportal);
        gallary=findViewById(R.id.gallary);
        uubus=findViewById(R.id.uubus);
        aboutus=findViewById(R.id.aboutus);

        department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DepartmentActivity.class);
                startActivity(intent);
            }
        });
        studentportal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Studentportal.class);
                startActivity(intent);
            }
        });
        gallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Gallary.class);
                startActivity(intent);
            }
        });
        uubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,UUbus.class);
                startActivity(intent);
            }
        });
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Aboutus.class);
                startActivity(intent);
            }
        });





    }

}
