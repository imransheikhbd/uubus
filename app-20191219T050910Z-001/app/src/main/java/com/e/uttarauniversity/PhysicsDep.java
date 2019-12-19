package com.e.uttarauniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhysicsDep extends AppCompatActivity {

    Button physicchairman,physicwebsite,physicfacebook,physicvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_dep);

        physicchairman=findViewById(R.id.physicchairman);
        physicwebsite=findViewById(R.id.physicwebsite);
        physicfacebook=findViewById(R.id.physicfacebook);
        physicvideo=findViewById(R.id.physicvideo);

        physicchairman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PhysicsDep.this,PhysicChairman.class);
                startActivity(intent);
            }
        });
        physicwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PhysicsDep.this,PhysicWebsite.class);
                startActivity(intent);
            }
        });
        physicfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PhysicsDep.this,PhysicFacebook.class);
                startActivity(intent);
            }
        });
        physicvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PhysicsDep.this,PhysicVideo.class);
                startActivity(intent);
            }
        });

    }
}
