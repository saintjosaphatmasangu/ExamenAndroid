package fr.justin.hoteli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoChambres extends AppCompatActivity {

    Button validerchambre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_chambres);

        this.validerchambre = (Button) findViewById(R.id.validerchambre);
        validerchambre.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), ReservationChambres.class);
                startActivity(otherActivity);
                finish();
            }

        });
    }
}