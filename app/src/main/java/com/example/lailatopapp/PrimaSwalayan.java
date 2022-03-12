package com.example.lailatopapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PrimaSwalayan extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center","SMS Center", "Driving Direction",
                "Website", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
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
            if (pilihan.equals("Call Center")) {
                String nomortel = "tel:+62 761 7069317";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center"))
            {
                String smsText="Nur Laila /P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:+62 761 7069317"));
                a.putExtra("sms_body", smsText);
            }else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "https://www.google.com/maps/place/0%C2%B027'52.2%22N+101%C2%B023'36.5%22E/@0.464511,101.393484,15z/data=!4m5!3m4!1s0x0:0x949601583519ea1a!8m2!3d0.464511!4d101.393484?hl=id-ID";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            }else if (pilihan.equals("Website"))
            {
                String website = "https://vymaps.com/ID/Prima-Swalayan-895476/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            }else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Prima Swalayan");
            }else if (pilihan.equals("Exit"))
            {
                finish();
            }
            startActivity(a);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

