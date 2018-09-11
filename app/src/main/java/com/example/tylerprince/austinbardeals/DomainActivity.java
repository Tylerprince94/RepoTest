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

        bars.add("77 Degrees");
        List<String> bar1 = new ArrayList<>();
        bar1.add("$5 Rail Liquor 3 pm - 7 pm");
        bar1.add("$4 Mexican Beers 3 pm - 7 pm");
        bar1.add("11500 Rock Rose Ave, Austin TX 78758");
        details.put(bars.get(0), bar1);

        bars.add("Nosh & Bevvy");
        List<String> bar2 = new ArrayList<>();
        bar2.add("$2.50 PBR or Lone Star Tall Boys 3:30 pm - 7 pm");
        bar2.add("$2.50 well drinks 3:30 pm - 7:30 pm");
        bar2.add("$0.50 off all beers 3:30 pm - 7 pm");
        bar2.add("8440 Burnet Road #100 Austin TX 78757");
        details.put(bars.get(1), bar2);

        bars.add("Casa Chapala");
        List<String> bar3 = new ArrayList<>();
        bar3.add("$3 drop pints ");
        bar3.add("$5 Mexican Martinis ");
        bar3.add("$ 5.50 House Margaritas");
        bar3.add("$6 Caguama Draft Beer");
        bar3.add("$8 top shelf margarita");
        bar3.add("9041 Research Blvd #100, Austin TX 78758");
        details.put(bars.get(2), bar3);

        bars.add("The Hideout Pub");
        List<String> bar4 = new ArrayList<>();
        bar4.add("$2.50 well drinks 3 pm - 7 pm");
        bar4.add("$4.50 all draft beers 3 pm - 7 pm");
        bar4.add("$2.50 Lone Star 3 pm - 7 pm");
        bar4.add("address placeholder");
        details.put(bars.get(3), bar4);

    }

    @Override
    public void onClick(View view){

    }

}
