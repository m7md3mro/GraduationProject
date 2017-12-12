package edu.philadelphia.observingactive;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    SQLiteDatabase observingactive3 ;
    Dbconnection dbcon;
    Button lgnBTN ;
   // EditText txtname , txtuser , txtpass , txtpass2 , txtphone , txtmail , txtcode ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
        public void register(View view) {
            if (view.getId()== R.id.btnrgis ){
        Intent intent = new Intent(this , MainActivity1.class);

        startActivity(intent);}
    }

    public void login(View view) {
        MainActivity4 M4 = new MainActivity4();
        Integer x = Integer.parseInt(String.valueOf(M4.findViewById(R.id.admincode)));
        MainActivity3 M3 = new MainActivity3();
        Integer y = Integer.parseInt(String.valueOf(M3.findViewById(R.id.Ocode)));
       if (view.getId() == R.id.lgnBTN) {

            if(x >=0 || x<=2000)
           {
             //  dbcon = new Dbconnection(this);
            //   observingactive3 = dbcon.getWritableDatabase();
            EditText uname = findViewById(R.id.etuser);
            EditText APass =findViewById(R.id.etpassword);
            Intent lgn = new Intent(this, MainActivity5.class);
             Bundle b2 = getIntent().getExtras();
            String adminuname = b2.getString("adminusuer");
            String adminpass = b2.getString("Adminpass");
            uname.setText(adminuname);
            APass.setText(adminpass);
               startActivity(lgn);
            }
            /*else if(y > 2000 && y < 4000)
            {
                EditText Ouname = (EditText) findViewById(R.id.Ouname);
                EditText OPass = (EditText) findViewById(R.id.Opass);
                Intent lgn = new Intent(MainActivity.this, MainActivity8.class);
                Bundle b2 = getIntent().getExtras();
                String Owneruname = b2.getString("Oname");
                String Owenerpass = b2.getString("Opass");
                Ouname.setText(Owneruname);
                OPass.setText(Owenerpass);


                startActivity(lgn);


                dbcon = new Dbconnection(this);
                observingactive3 = dbcon.getWritableDatabase();
            }*/
           /* else {
                Intent lgn = new Intent(MainActivity.this, MainActivity2.class);

            }*/


            //String Passwords = dbcon.searchPass()

        }
        //if
        //

        //txtname = (EditText)findViewById(R.id.adminname);

        //txtpass2 = (EditText)findViewById(R.id.adminpass2);
        // txtphone = (EditText)findViewById(R.id.adminphone);
        //  txtmail = (EditText)findViewById(R.id.adminmail);
        //    txtcode = (EditText)findViewById(R.id.admincode);


        //  String name = txtname.getText().toString();

        //String pass2 =txtpass2.getText().toString();
        //String phone = txtphone.getText().toString();
        //String mail = txtmail.getText().toString();
        //String code = txtcode.getText().toString();


        // startActivity(intent);

        //txtuser = (EditText)findViewById(R.id.aduser);
        //txtpass = (EditText)findViewById(R.id.adpassword);
        //  lgnBTN = (Button) findViewById(R.id.lgnBTN);





        /*if (dbcon.checkusers(observingactive3 , user , pass))
        {


        }
        else
        {
            Toast.makeText(MainActivity.this, "incorrect Password or username", Toast.LENGTH_SHORT).show();
        }
       // Toast.makeText(MainActivity.this, "incorrect Password or username", Toast.LENGTH_LONG).show();

    }*/


    }
}

