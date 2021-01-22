package fr.justin.hoteli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class VisiteChambres extends AppCompatActivity {

    private ImageView cliquerImage2;
    private ImageView cliquerImage1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visite_chambres);

        this.cliquerImage2 = (ImageView) findViewById(R.id.cliquerImage2);
        cliquerImage2.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), InfoChambres.class);
                startActivity(otherActivity);
                finish();
            }
        });

        this.cliquerImage1 = (ImageView) findViewById(R.id.cliquerImage1);
        cliquerImage1.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), InfoChambres.class);
                startActivity(otherActivity);
            }

        });
    }
}
