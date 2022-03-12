package com.example.lailatopapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class supermarket extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[] {"Lucky Supermarket", "Planet Swalayan",
                "Pesona Swalayan", "Prima Swalayan"};
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
            if (pilihan.equals("Lucky Supermarket")) {
                a = new Intent(this, LuckySupermarket.class);

            } else if (pilihan.equals("Planet Swalayan"))
            {
                a = new Intent(this, PlanetSwalayan.class);

            } else if (pilihan.equals("Pesona Swalayan"))
            {
                a = new Intent(this, PesonaSwalayan.class);

            }else if (pilihan.equals("Prima Swalayan"))
                a = new Intent(this, PrimaSwalayan.class);
            {

            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
