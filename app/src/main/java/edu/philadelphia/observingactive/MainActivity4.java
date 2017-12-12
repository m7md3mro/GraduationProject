package edu.philadelphia.observingactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity  {
    private final AppCompatActivity activity = MainActivity4.this;
    private EditText txtname;
    private EditText txtuser;
    private EditText txtpass;
    private EditText txtpass2;
    private EditText txtphone;
    private EditText txtmail;
    private EditText txtcode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //  Dbconnection dbcon = new Dbconnection(this);

    }


    //  Button adreg = (Button) findViewById(R.id.Areg1);
    public void Adm_reg(View view) {
        Dbconnection dbcon = new Dbconnection(activity);
         txtname = findViewById(R.id.adminname);
         txtuser = findViewById(R.id.adminuser);
         txtpass = findViewById(R.id.adminpass);
         txtpass2 = findViewById(R.id.adminpass2);
         txtphone = findViewById(R.id.adminphone);
         txtmail = findViewById(R.id.adminmail);
         txtcode = findViewById(R.id.admincode);
        //Button Areg1;
        //  Button Areg1 = (Button)findViewById(R.id.Areg1);
        final String Aname = txtname.getText().toString();
        final String Auser = txtuser.getText().toString();
        final String Apass = txtpass.getText().toString();
        final String Apass2 = txtpass2.getText().toString();
        final int Aphone = Integer.parseInt(txtphone.getText().toString());
        final String Amail = txtmail.getText().toString();
        // final String Acode = txtcode.getText().toString();
        final int Acode = Integer.parseInt(txtcode.getText().toString());
        //dbcon.onCreate(db);
        //dbcon.onUpgrade(db , 1 , 1 );


        // dbcon.inserdata(Aname, Auser, Apass, Acode, Amail, Aphone);

        //  EditText txtname , txtuser , txtpass , txtpass2 , txtphone , txtmail , txtcode ;


        //Boolean isInserted ;
        Boolean isInserted = dbcon.inserdata(Aname, Auser, Apass, Acode, Amail, Aphone);
        if (isInserted) {
            Toast.makeText(this, "Done", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Fail", Toast.LENGTH_LONG).show();

        }
/*

.
 */
/*
        if (!Apass.equals(Apass2)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle("hello");
            builder.setMessage("Password Dose not matches");
            Intent gg = new Intent(this, MainActivity4.class);
            startActivity(gg);
            // Toast.makeText(this, "Password dose not matches", Toast.LENGTH_LONG).show();
        } else {

              /*  dbcon = new Dbconnection(this);

                Contact c = new Contact();
                c.setName(Aname);
                c.setUname(Auser);
                c.setPass(Apass);
                c.setPhone(Aphone);
                c.setEmail(Amail);
                c.setCode(Acode);

                dbcon.insertContact(c);


            Intent gg = new Intent(this, MainActivity.class);
      /*  Bundle b = new Bundle();
        b.putString("adminusuer", Auser);
        b.putString("adminpass", Apass);
        gg.putExtras(b);

            startActivity(gg);*/
        }
        //  adreg = (Button) findViewById(R.id.Areg1);


        //  boolean result = dbcon.inserdata(name , user , pass ,pass2 ,code,mail,phone);
        /* if (result == true )
         {
             Toast.makeText(this, "Done", Toast.LENGTH_LONG).show();
             Intent intent = new Intent(this,MainActivity.class);

             startActivity(intent);
         }
         else
         {
             Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();

         }*/
        //    db = dbcon.getWritableDatabase();


        /* if (dbcon.checkusers(db , name , pass))
         {
             Intent intent = new Intent(this,MainActivity.class);

             startActivity(intent);

         }
         else
         {
             Toast.makeText(this, "incorrect username or password ", Toast.LENGTH_SHORT).show();

         }*/

        // dbcon.InsertRowAdmin(txtname.getText().toString() , txtuser.getText().toString() , txtpass.getText().toString() );
    }


