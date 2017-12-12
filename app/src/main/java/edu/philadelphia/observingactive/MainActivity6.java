package edu.philadelphia.observingactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity6 extends AppCompatActivity {

    EditText sname = (EditText)findViewById(R.id.searchname);
    Spinner sloc = (Spinner)findViewById(R.id.searchlocation);
    Spinner sexp = (Spinner)findViewById(R.id.searchexp);
    Spinner sstatus = (Spinner)findViewById(R.id.searchstatus);

    String searchn = sname.getText().toString();
    String locsearch = sloc.getSelectedItem().toString();
    String expsearch = sexp.getSelectedItem().toString();
    String ssearch = sstatus.getSelectedItem().toString();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Spinner LocationS = (Spinner)findViewById(R.id.searchlocation);

        ArrayAdapter<String> LocationA = new ArrayAdapter<String>
                ( MainActivity6.this ,android.R.layout.simple_expandable_list_item_1,
                        getResources().getStringArray(R.array.Loc));
        LocationA.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
        LocationS.setAdapter(LocationA);

        Spinner experS = (Spinner)findViewById(R.id.searchexp);

        ArrayAdapter<String> experA = new ArrayAdapter<String>( this ,android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.Exp));
        experA.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
        experS.setAdapter(experA);

        Spinner statusS = (Spinner)findViewById(R.id.searchstatus);

        ArrayAdapter<String> statusA = new ArrayAdapter<String>(this , android.R.layout.simple_expandable_list_item_1 ,
                getResources().getStringArray(R.array.status));
        statusA.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
        statusS.setAdapter(statusA);

    }


    public void Searchemployee(View view) {
        Intent intent = new Intent(this , MainActivity7.class);

        Bundle b3 = new Bundle();
        b3.putString("sname" , searchn);
        b3.putString("sloc" , locsearch);
        b3.putString("sexp" , expsearch);
        b3.putString("sstatus" , ssearch);



        startActivity(intent);
    }
}
