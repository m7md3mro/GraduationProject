package edu.philadelphia.observingactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void map(View view) {
        Intent intent = new Intent(this , MapsActivity.class);
        startActivity(intent);
    }
}
