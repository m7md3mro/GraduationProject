package edu.philadelphia.observingactive;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//import com.androidtutorialshub.loginregister.model.User;


/**
 * Created by Owner on 11/29/2017.
 */

public class Dbconnection extends SQLiteOpenHelper {
    private static final String Dbname = "observingactive3.db";
    private static final int Verson = 1;
    private static final String Table_AName = "Admin";
    private static final int Colom_AdminID = Integer.parseInt("id");
    private static final String Colom_AdminName = "name";
    private static final String Colom_AdminUsername = "uname";
    private static final String Colom_AdminPassword = "pass";
    private static final int Colom_AdminCode =Integer.parseInt("code");
    private static final String Colom_AdminEmail = "email";
    private static final int Colom_AdminPhone = Integer.parseInt("phone");

   /* private static final String Table_PName = "Promoter";
    private static final Integer Colom_PID = Integer.valueOf("Pid");
    private static final String Colom_PName = "Pname";
    private static final String Colom_PUname = "Puname";
    private static final String Colom_PPassword = "Ppass";
    private static final Integer Colom_PPhone = Integer.valueOf("Ppass");
    private static final String Colom_PLocation = "PLoc";
    private static final Integer Colom_PAge = Integer.valueOf("PAge");
    private static final String Colom_PGender = "PGender";
    private static final String Colom_PExp = "PExp";*/





    //  public String searchPass(String colom_Uname)
    public Dbconnection(Context context) {
        super(context, Dbname, null, Verson);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

/*
        db.execSQL("CREATE TABLE " + Table_AName + "("
                + Colom_AdminID + " INTEGER PRIMARY KEY AUTOINCREMENT," + Colom_AdminName + " TEXT NOT NULL,"
                + Colom_AdminUsername + " TEXT NOT NULL," + Colom_AdminPassword + " TEXT NOT NULL" + Colom_AdminCode + "TEXT NOT NULL, "
                + Colom_AdminEmail + "TEXT ," +Colom_AdminPhone + "TEXT NOT NULL" + ")");
*/
     /*  db.execSQL("Create table IF NOT EXISTS Admin ( INTEGER primary key AUTOINCREMENT ," +
                "AdminName TEXT not null," +
                "AdminUsername TEXT not null," +
                "AdminPassword TEXT not null," +
                "AdminCode INTEGER not null ," +
                " AdminEmail TEXT ," +
                " AdminPhone INTEGER not null)");*/
       // db.execSQL("Create table if NOT EXISTS Promoter (PID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,PName TEXT NOT NULL,PUname TEXT NOT NULL,PPassword TEXT NOT NULL,PPhone INTEGER NOT NULL,PLocation TEXT NOT NULL,PAge INTEGER NOT NULL,PGender TEXT NOT NULL,PExp TEXT NOT NULL) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(" Drop Table If EXISTS " + Table_AName);
    //    db.execSQL("Drop Table IF EXISTS " + Table_PName );
       onCreate(db);

    }

   /* public void insertContact(Contact c) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Colom_Name, c.getName());
        values.put(Colom_Uname, c.getUname());
        values.put(Colom_Pass, c.getPass());
        values.put(String.valueOf(Colom_Code), c.getCode());
        values.put(Colom_Email, c.getEmail());
        values.put(String.valueOf(Colom_Phone), c.getPhone());


        db.insert(Table_Name, null, values);


    }*/
    protected boolean inserdata(String AdminName, String AdminUsername, String AdminPassword,
                             int AdminCode, String AdminEmail, int AdminPhone)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("AdminName", AdminName);
        contentValues.put("AdminUsername", AdminUsername);
        contentValues.put("AdminPassword", AdminPassword);
      //  contentValues.put("AdminPassword2", AdminPassword2);
        contentValues.put("AdminCode", AdminCode);
        contentValues.put("AdminEmail", AdminEmail);
        contentValues.put("AdminPhone", AdminPhone);
        db.insert(Table_AName, null, contentValues);

        long result = db.insert(Table_AName, null, contentValues);
        if (result == -1){
            return false;}
        else {return true;}


    }
    /*
    public List<Contact> getAllUser() {

        String[] columns = {
                String.valueOf(Colom_AdminID),
                Colom_AdminEmail,
                Colom_AdminName,
                Colom_AdminPassword
        };
        List<Contact> userList = new ArrayList<Contact>();
        SQLiteDatabase db = this.getReadableDatabase();
    String sortOrder =Colom_AdminUsername + " ASC";
    Cursor cursor = db.query(Table_AName,columns,null,null,null,null,sortOrder);


      if (cursor.moveToFirst()) {
        do {
            Contact user = new Contact();
            user.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex(String.valueOf(Colom_AdminID)))));
            user.setName(cursor.getString(cursor.getColumnIndex(Colom_AdminName)));
            user.setEmail(cursor.getString(cursor.getColumnIndex(Colom_AdminEmail)));
            user.setPass(cursor.getString(cursor.getColumnIndex(Colom_AdminPassword)));

            userList.add(user);
        } while (cursor.moveToNext());
    }
        cursor.close();
        db.close();


        return userList;
}
    public void updateUser(Contact user) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Colom_AdminUsername, user.getName());
        values.put(Colom_AdminEmail, user.getEmail());
        values.put(Colom_AdminPassword, user.getPass());


        db.update(Table_AName, values, Colom_AdminID + " = ?",
                new String[]{String.valueOf(user.getId())});
        db.close();
    }
    public void deleteUser(Contact user) {
        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(Table_AName, Colom_AdminID + " = ?",
                new String[]{String.valueOf(user.getId())});
        db.close();
    }
    public boolean checkUser(String email) {
        String[] columns = {String.valueOf(Colom_AdminID)
        };
        SQLiteDatabase db = this.getReadableDatabase();
        String selection = Colom_AdminEmail + " = ?";
        String[] selectionArgs = {email};
        Cursor cursor = db.query(Table_AName,columns,selection,selectionArgs,null,null,null);
        int cursorCount = cursor.getCount();
        cursor.close();
        db.close();

        if (cursorCount > 0) {
            return true;
        }

        return false;
    }



    public boolean checkUser(String email, String password) {
        String[] columns = {
                String.valueOf(Colom_AdminID)
        };
        SQLiteDatabase db = this.getReadableDatabase();
        String selection = Colom_AdminEmail + " = ?" + " AND " + Colom_AdminPassword + " = ?";
        String[] selectionArgs = {email, password};
        Cursor cursor = db.query(Table_AName,columns,selection,selectionArgs,null,null,null);
        int cursorCount = cursor.getCount();

        cursor.close();
        db.close();
        if (cursorCount > 0) {
            return true;
        }

        return false;
    }
    /*

     */
/*    public boolean inserdataP(String PName, String PUname, String PPassword,
                             Integer PPhone, String Plocation, Integer PAge , String PGender , String PExp)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put("PName", PName);
        value.put("PUname", PUname);
        value.put("PPassword", PPassword);
     //   contentValues.put("AdminPassword2", AdminPassword2);
        value.put("PPhone", PPhone);
        value.put("PLocation", Plocation);
        value.put("PAge", PAge);
        value.put("PGender", PGender);
        value.put("PExp",PExp);
        db.insert("Promoter", null, value);

        long Presult = db.insert("Promoter", null, value);
        if (Presult == -1){
            return false;}
        else {return true;}
    }*/



    /*public boolean checkusers(SQLiteDatabase observingactive3 , String AdminUsername ,String AdminPassword ){
        Cursor cur =  observingactive3.rawQuery("SELECT * FROM Admin where AdminUsername="+AdminUsername+"" +
                " and AdminPassword="+AdminPassword+"",null);
        if (cur.getCount()>0)
            return true ;


            return false;*/

}

