package edu.philadelphia.observingactive;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    SQLiteDatabase db ;
    Dbconnection dbcon;
   // Button Oreg ;
   EditText txtname = (EditText)findViewById(R.id.Oname);
    EditText txtuser = (EditText)findViewById(R.id.Ouname);
    EditText txtpass = (EditText)findViewById(R.id.Opass);
    EditText txtpass2 = (EditText)findViewById(R.id.Opass2);
    EditText txtphone = (EditText)findViewById(R.id.Ophone);
    EditText txtmail = (EditText)findViewById(R.id.Omail);
    EditText txtcode = (EditText)findViewById(R.id.Ocode);

    String Oname = txtname.getText().toString();
    String Ouser = txtuser.getText().toString();
    String Opass = txtpass.getText().toString();
    String Opass2 =txtpass2.getText().toString();
    Integer Ophone = Integer.parseInt(String.valueOf(txtphone));
    String Omail = txtmail.getText().toString();
    Integer Ocode = Integer.parseInt(String.valueOf(txtcode));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        dbcon = new Dbconnection(this);
    }

    public void Own_reg(View view) {
        if (view.getId()== R.id.Oreg)
        {
           /* boolean isInserted = dbcon.inserdata(Oname, Ouser, Opass, Ocode, Omail, Ophone);
            if(isInserted == true )
            {
                Toast.makeText(this, "Done", Toast.LENGTH_LONG).show();

            }
            else
            {*/
                Toast.makeText(this, "Fail", Toast.LENGTH_LONG).show();

            }
            if (!Opass.equals(Opass2)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle("hello");
                builder.setMessage("Password Dose not matches");
            }
            else
                {
                Intent gg = new Intent(this, MainActivity.class);
                Bundle b = new Bundle();
                b.putString("Ouser", Ouser);
                b.putString("Opass", Opass);
                gg.putExtras(b);

                startActivity(gg);

                }



             /*   dbcon = new Dbconnection(this);

                Contact c =new Contact();
                c.setName(Oname);
                c.setUname(Ouser);
                c.setPass(Opass);
                c.setPhone(Ophone);
                c.setEmail(Omail);
                c.setCode((Ocode));

                dbcon.insertContact(c);*/




        }


       // Oreg = (Button)findViewById(R.id.Oreg);

    }
