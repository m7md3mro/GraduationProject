package edu.philadelphia.observingactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void search(View view) {
        Intent intent = new Intent(this , MainActivity6.class);
        startActivity(intent);
    }

    public void events(View view) {
        Intent intent = new Intent(this , MainActivity8.class);
        startActivity(intent);
    }
}
