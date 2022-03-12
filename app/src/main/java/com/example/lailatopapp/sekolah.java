package com.example.lailatopapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sekolah extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[] {"SMAS Darma Yudha", "SMAN Plus Prop Riau",
                "SMAN 8 Pekanbaru", "MAN 2 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listRS));
    }

    protected  void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilankanpilihan(pilihan);
    }

    private void tampilankanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SMAS Darma Yudha")) {
                a = new Intent(this, SmasDarmaYudha.class);

            } else if (pilihan.equals("SMAN Plus Prop Riau"))
            {
                a = new Intent(this, SmanPlusPropRiau.class);

            } else if (pilihan.equals("SMAN 8 Pekanbaru"))
            {
                a = new Intent(this, Sman8Pekanbaru.class);

            }else if (pilihan.equals("MAN 2 Pekanbaru"))
                a = new Intent(this, Man2Pekanbaru.class);
            {

            }
            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
