package com.example.reno.fragmenttabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
public class MainActivity extends FragmentActivity {
    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (FragmentTabHost) findViewById(R.id.mi_tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.contenido);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Lengüeta 1"),
                Tab1.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Lengüeta 2"),
                Tab2.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Lengüeta 3"),
                Tab3.class, null);
    }
}
