package cl.awakelab.movimientoentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initListeners();
    }


    private void initListeners() {

        Button boton = findViewById(R.id.secondActivityButtonGoBack);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button botonUrl = findViewById(R.id.openUrlButton);
        String url = "https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html";

        botonUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(implicitIntent);
            }
        });

    }



}