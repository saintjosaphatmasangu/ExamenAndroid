package fr.justin.hoteli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class camerapplication extends AppCompatActivity {
    canevas canevas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camerapplication);

        canevas = new canevas(this,null);
        setContentView(canevas);
    }
}