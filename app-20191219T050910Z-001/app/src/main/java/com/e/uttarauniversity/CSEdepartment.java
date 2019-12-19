package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CSEdepartment extends AppCompatActivity {

    Button csechairman,csewebsite,csefacebook,csevideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csedepartment);

        csechairman=findViewById(R.id.csechairman);
        csewebsite=findViewById(R.id.csewebsite);
        csefacebook=findViewById(R.id.csefacebook);
        csevideo=findViewById(R.id.csevideo);

        csechairman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSEdepartment.this,cseChairmanActivity.class);
                startActivity(intent);
            }
        });
        csewebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSEdepartment.this,cseWebsiteActivity.class);
                startActivity(intent);
            }
        });
        csefacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSEdepartment.this,cseFacebookActivity.class);
                startActivity(intent);
            }
        });
        csevideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CSEdepartment.this,cseVideoActivity.class);
                startActivity(intent);
            }
        });


    }
}
