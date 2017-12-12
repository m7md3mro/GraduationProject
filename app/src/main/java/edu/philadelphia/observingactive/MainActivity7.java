package edu.philadelphia.observingactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        ArrayList<ListEvent> myevent = new ArrayList<ListEvent>();
       // myevent.add(new ListEvent())
        MyAdabter adabter = new MyAdabter(myevent);
        Dbconnection db = new Dbconnection(this);
        db.getReadableDatabase();
        ListView ls = (ListView)findViewById(R.id.listview1);
        ls.setAdapter(adabter);



    }
    class MyAdabter extends BaseAdapter
    {
        ArrayList<ListEvent> myevent = new ArrayList<ListEvent>();
        MyAdabter(ArrayList<ListEvent> myevent){
            this.myevent=myevent;

        }

        @Override
        public int getCount() {
            return myevent.size();
        }

        @Override
        public Object getItem(int position) {
            return myevent.get(position).name;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup parent) {
            LayoutInflater inflater =getLayoutInflater();
            View view1 = inflater.inflate(R.layout.activity_main7,null);
            TextView txtname = (TextView) view1.findViewById(R.id.txtname);
            TextView txtdes = (TextView) view1.findViewById(R.id.txtdesc);
            txtname.setText(myevent.get(i).name);
            txtdes.setText(myevent.get(i).des);

            return view1;

        }
    }
}
