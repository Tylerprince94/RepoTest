package com.example.tylerprince.austinbardeals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import android.content.Context;

public class DomainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = getClass().getSimpleName();
    private LinearLayout DomainBarList;

    ExpandableListView expandableListView;
    List<String> bars;
    Map<String, List<String>> details;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domain);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        fillData();
        listAdapter = new MyExpandableListAdapter(this, bars, details);
        expandableListView.setAdapter(listAdapter);

    }

    public void fillData() {

        bars = new ArrayList<>();
        details = new HashMap<>();

        bars.add("Bar1");
        bars.add("Bar2");

        List<String> bar1 = new ArrayList<>();
        List<String> bar2 = new ArrayList<>();

        bar1.add("deal1");
        bar1.add("deal2");
        bar1.add("deal3");
        bar1.add("deal4");
        bar1.add("deal5");
        bar1.add("address link placeholder");

        bar2.add("deal1");
        bar2.add("deal2");
        bar2.add("deal3");
        bar2.add("deal4");
        bar2.add("deal5");
        bar2.add("address link");

        details.put(bars.get(0), bar1);
        details.put(bars.get(1), bar2);
    }

    @Override
    public void onClick(View view){

    }

}
