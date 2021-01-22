package fr.justin.hoteli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

public class camera extends AppCompatActivity {

    private static final int CAPTURE_IMAGE = 1;

    private ImageView imageView;
    private Button camerabtn;
    private Button dessinner;
    private String photoPath;
    Uri fichUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        initActivity();

        this.dessinner = (Button) findViewById(R.id.dessinner);
        dessinner.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){
                Intent otherActivity = new Intent(getApplicationContext(), camerapplication.class);
                startActivity(otherActivity);
                finish();
            }

        });

    }

    private void initActivity(){
        this.camerabtn = (Button) findViewById(R.id.camerabtn);
        this.camerabtn = (Button) findViewById(R.id.camerabtn);
        camerabtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                prendreUnePhoto();
            }
        });
    }

    private void prendreUnePhoto(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager()) != null){
            File directory = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),getPackageName());
            File fich = new File(directory.getPath());
            photoPath = fich.getAbsolutePath();
            fichUri = Uri.fromFile(fich);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, fichUri);
            startActivityForResult(intent, CAPTURE_IMAGE);
        }else {
            Toast.makeText(this, "ERREUR", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if (requestCode == CAPTURE_IMAGE && resultCode == RESULT_OK) {
            Bitmap bitmap = BitmapFactory.decodeFile(String.valueOf(photoPath));
            imageView.setImageBitmap(bitmap);
        }
    }
}