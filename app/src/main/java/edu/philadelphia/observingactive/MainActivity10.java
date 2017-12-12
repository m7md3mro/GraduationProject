package edu.philadelphia.observingactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Date;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


      /*  EditText edttxt =(EditText)findViewById(R.id.Startdate2);
       long date = Date.parse(edttxt.getText().toString());

        if (date >= Date ) {
           setVrModeEnabled(false, date);


        }*/
    }

    public void map(View view) {
        Intent intent = new Intent(this , MapsActivity.class);
        startActivity(intent);
    }
}
