package fr.justin.hoteli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReservationChambres extends AppCompatActivity {

    private Button prendreCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_chambres);

        this.prendreCamera = (Button) findViewById(R.id.prendreCamera);
        prendreCamera.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), camera.class);
                startActivity(otherActivity);
                finish();
            }

        });
    }
}