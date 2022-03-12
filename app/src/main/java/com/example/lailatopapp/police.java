package com.example.lailatopapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class police extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[] {"Polda Riau", "Polresta Pekanbaru",
                "Polsek Pekanbaru Kota", "Polsek Senapelan"};
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
            if (pilihan.equals("Polda Riau")) {
                a = new Intent(this, PoldaRiau.class);

            } else if (pilihan.equals("Polresta Pekanbaru"))
            {
                a = new Intent(this, PolrestaPekanbaru.class);

            } else if (pilihan.equals("Polsek Pekanbaru Kota"))
            {
                a = new Intent(this, PolsekPekanbaruKota.class);

            }else if (pilihan.equals("Polsek Senapelan"))
                a = new Intent(this, PolsekSenapelan.class);
            {

            }
            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
