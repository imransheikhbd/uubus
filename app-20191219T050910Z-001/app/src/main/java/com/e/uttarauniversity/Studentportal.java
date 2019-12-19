package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Studentportal extends AppCompatActivity {

    Button erplogin,uuresult,tuitionfees,classroutine,examroutine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentportal);

        erplogin=findViewById(R.id.erplogin);
        uuresult=findViewById(R.id.uuresult);
        tuitionfees=findViewById(R.id.tuitionfees);
        classroutine=findViewById(R.id.classroutine);
        examroutine=findViewById(R.id.examroutine);

        erplogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Studentportal.this,ERPloginActivity.class);
                startActivity(intent);
            }
        });
        uuresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Studentportal.this,ResultuuActivity.class);
                startActivity(intent);
            }
        });
        tuitionfees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Studentportal.this,TuitionfeesActivity.class);
                startActivity(intent);
            }
        });
        classroutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Studentportal.this,ClassroutineActivity.class);
                startActivity(intent);
            }
        });
        examroutine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Studentportal.this,ExamroutineActivity.class);
                startActivity(intent);
            }
        });
    }
}
