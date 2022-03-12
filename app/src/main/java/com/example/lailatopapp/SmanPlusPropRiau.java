package com.example.lailatopapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SmanPlusPropRiau extends ListActivity {
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
                String nomortel = "tel:0761 41700";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center"))
            {
                String smsText="Nur Laila /P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0761 41700"));
                a.putExtra("sms_body", smsText);
            }else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "https://www.google.com/maps/dir//sman+plus+prop+riau/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x31d5a873ae3de173:0x6596574a06800d8d?sa=X&ved=2ahUKEwje8ZLA6732AhV_SmwGHYRTAjUQ9Rd6BAguEAQ";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
            }else if (pilihan.equals("Website"))
            {
                String website = "https://smanplus-provriau.sch.id/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            }else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"SMAN Plus Prop Riau");
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
