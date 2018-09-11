package com.example.tylerprince.austinbardeals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.content.Context;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyExpandableListAdapter extends BaseExpandableListAdapter {
    Context context;
    List<String> bars;
    Map<String, List<String>> details;

    public MyExpandableListAdapter(Context context, List<String> bars, Map<String, List<String>> details) {
        this.context = context;
        this.bars = bars;
        this.details = details;
    }

    @Override
    public int getGroupCount() {
        //number of bars on app (# of parents)
        return bars.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        //number of details per bar (# of children)
        return details.get(bars.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        //get the name of the bar
        return bars.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        //get a detail from a bar (get a child from a parent)
        return details.get(bars.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String barName = (String) getGroup(groupPosition);
        if(convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_parent, null);
        }

        TextView txtParent = (TextView) convertView.findViewById(R.id.txtParent);
        txtParent.setText(barName);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String details = (String) getChild(groupPosition, childPosition);
        if(convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_child,null);
        }

        TextView txtChild = (TextView) convertView.findViewById(R.id.txtChild);
        txtChild.setText(details);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
