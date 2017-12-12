package edu.philadelphia.observingactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }

    public void createevent(View view) {
        Intent intent = new Intent(this , MainActivity9.class);
        startActivity(intent);
    }

    public void s(View view) {
        Intent intent = new Intent (this ,MainActivity10.class );
        startActivity(intent);
    }
}
