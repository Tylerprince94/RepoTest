package com.example.tylerprince.austinbardeals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class AllBarsActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = getClass().getSimpleName();
    private LinearLayout DomainBarList;

    ExpandableListView expandableListView;
    List<String> bars;
    Map<String, List<String>> details;
    ExpandableListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allbars);

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        fillData();
        listAdapter = new MyExpandableListAdapter(this, bars, details);
        expandableListView.setAdapter(listAdapter);

        DatabaseHelper db = new DatabaseHelper();
        db.getAllDeals();

    }

    public void fillData() {

        bars = new ArrayList<>();
        details = new HashMap<>();

        bars.add("77 Degrees");
        List<String> bar0 = new ArrayList<>();
        bar0.add("Happy Hour: Monday - Friday 3 PM - 7 PM");
        bar0.add("$4 Mexican Beers");
        bar0.add("$5 Rail Mixers");
        bar0.add("11500 Rock Rose Ave, Austin TX 78758");
        details.put(bars.get(0), bar0);

        bars.add("Nosh and Bevvy");
        List<String> bar1 = new ArrayList<>();
        bar1.add("Happy Hour: Monday - Sunday 3:30 pm - 7 pm");
        bar1.add("$2.50 Tall boys (PBR or Lonestar");
        bar1.add("$2.50 Rail Mixers");
        bar1.add("$0.50 off all beers");
        bar1.add("8440 Burnet Rd #100, Austin TX 78757");
        details.put(bars.get(1), bar1);

        bars.add("Casa Chapala");
        List<String> bar2 = new ArrayList<>();
        bar2.add("Happy Hour: Sunday - Tuesday All Day");
        bar2.add("Happy Hour: Wednesday on the patio 7 PM - 10 PM");
        bar2.add("Happy Hour: Thursday & Friday 2 PM - 6 PM");
        bar2.add("$3 Drop Pints");
        bar2.add("$5 Mexican Martini");
        bar2.add("$5.50  House Margaritas");
        bar2.add("$6 Caguama Draft Beers");
        bar2.add("$8 Top Shelf Margaritas");
        bar2.add("9041 Research Blvd #100, Austin TX 78758");
        details.put(bars.get(2), bar2);

        bars.add("Hideout");
        List<String> bar3 = new ArrayList<>();
        bar3.add("Happy Hour: Monday - Thursday 3 PM - 7 PM");
        bar3.add("$2.50 Rail Mixers");
        bar3.add("$2.50 Lonestars");
        bar3.add("$4.50 All Draft Beers");
        bar3.add("12164 MoPac Expy, Austin, TX 78757");
        details.put(bars.get(3), bar3);

        bars.add("NXNW");
        List<String> bar4 = new ArrayList<>();
        bar4.add("Happy Hour: Monday - Sunday 4 PM - 7 PM");
        bar4.add("$4 Cocktails");
        bar4.add("$1.00 off all Pints");
        bar4.add("10010 N Capital of Texas Hwy, Austin, TX 78759");
        details.put(bars.get(4), bar4);

        bars.add("Second");
        List<String> bar5 = new ArrayList<>();
        bar5.add("Happy Hour: Monday - Sunday 3 PM - 6 PM");
        bar5.add("$5 Glass of Wine");
        bar5.add("$5 Tap Beers");
        bar5.add("$5 Mixer Specials");
        bar5.add("3121 Palm Way #101, Austin, TX 78758");
        details.put(bars.get(5), bar5);

        bars.add("Yard House");
        List<String> bar6 = new ArrayList<>();
        bar6.add("Happy Hour: Monday - Friday 3 PM - 6 PM & 10 PM - 11 PM");
        bar6.add("OFF $2 Select Drafts, Wines, Mixers and Cocktails");
        bar6.add("OFF $3 9 oz Wine");
        bar6.add("OFF $4 half Yard");
        bar6.add("11800 Domain Blvd Suite 700 Austin, TX, 78758");
        details.put(bars.get(6), bar6);

        bars.add("Culinary Dropout");
        List<String> bar7 = new ArrayList<>();
        bar7.add("Happy Hour: Monday - Friday 3 PM - 6 PM");
        bar7.add("$5 Sangria");
        bar7.add("$5 Rail Cocktails");
        bar7.add("$5 Raw Pints");
        bar7.add("$5 Airplane Picklebacks");
        bar7.add("11721 Rock Rose Ave #100, Austin, TX 78758");
        details.put(bars.get(7), bar7);

        bars.add("Mia");
        List<String> bar8 = new ArrayList<>();
        bar8.add("Happy Hour: Tuesday, Thursday & Friday 3 PM - 7 PM");
        bar8.add("OFF $2 Wine");
        bar8.add("OFF $1 Local Drafts");
        bar8.add("$8 House Cocktails Raw Pints");
        bar8.add("Saturday & Sunday Brunch");
        bar8.add("$2 Mimosas");
        bar8.add("$5 Bloody's");
        bar8.add("$5 Tequila Sunrises");
        bar8.add("11420 Rock Rose Ave #120, Austin, TX 78758");
        details.put(bars.get(8), bar8);

        bars.add("Brass Tap");
        List<String> bar9 = new ArrayList<>();
        bar9.add("Happy Hour: Monday - Friday 3 PM - 7 PM");
        bar9.add("OFF $1.50 Draft Beers");
        bar9.add("OFF $1.50 Wine");
        bar9.add("OFF $1.50 House Cocktails");
        bar9.add("10910 Domain Dr #120, Austin, TX 78758");
        details.put(bars.get(9), bar9);
/*
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

        bars.add("NXNW");
        List<String> bar5 = new ArrayList<>();
        bar5.add("4 - 7 $1 off all pints");
        bar5.add("$6 glass of wine (Pino & Donte)");
        bar5.add("2 specialty cocktails for $4");
        bar5.add("3 specialty cocktails for $5");
        bar5.add("3 specialty cocktails for $6");
        bar5.add("12 appetizers for $6");
        bar5.add("address placeholder");
        details.put(bars.get(4), bar5);

        bars.add("Second Bar");
        List<String> bar6 = new ArrayList<>();
        bar6.add("3 - 6 $5 wine glasses");
        bar6.add("half off wine bottles");
        bar6.add("$5 tap beers");
        bar6.add("$5 Specialty drinks");
        details.put(bars.get(5), bar6);
       */
    }

    @Override
    public void onClick(View view){

    }
}
