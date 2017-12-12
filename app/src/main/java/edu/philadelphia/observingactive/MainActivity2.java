package edu.philadelphia.observingactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//for drop down list
        Spinner Gender_S = (Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> Gender_A = new ArrayAdapter<String>
                (MainActivity2.this ,android.R.layout.simple_expandable_list_item_1,
                        getResources().getStringArray(R.array.Gender));
        Gender_A.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Gender_S.setAdapter(Gender_A);
//done for drop down list

        Spinner Loc_S = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> Loc_A = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,
               getResources().getStringArray(R.array.Loc));
        Loc_A.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Loc_S.setAdapter(Loc_A);

        Spinner Exp_S = (Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> Exp_A = new ArrayAdapter<String>(this ,android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.Exp));
        Exp_A.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
        Exp_S.setAdapter(Exp_A);
    }

    public void Emp_reg(View view) {

        Intent intent = new Intent(this ,MainActivity.class);

        startActivity(intent);

    }
}
