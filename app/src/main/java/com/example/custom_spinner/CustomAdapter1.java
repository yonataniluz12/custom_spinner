package com.example.custom_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter1 extends BaseAdapter {
    Context context;
    String ContreList[];
    int images[];
    String CapitalList[];
    LayoutInflater inflter;

    public CustomAdapter1(Context context,String [] ContreList,int [] images,String [] capitalList) {
        this.context = context;
        this.CapitalList = capitalList;
        this.ContreList = ContreList;
        this.images = images;
        this.inflter = (LayoutInflater.from(context));
    }
    @Override
    public int getCount(){
        return ContreList.length;
    }
    @Override
    public Object getItem(int i){
        return null;
    }
    @Override
    public long getItemId(int i){
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        view = inflter.inflate(R.layout.layout_contris, null);
        TextView countries = (TextView) view.findViewById(R.id.countries);
        TextView Capital = (TextView) view.findViewById(R.id.Capital);
        ImageView iV = (ImageView) view.findViewById(R.id.iV);
        countries.setText(ContreList[i]);
        Capital.setText(CapitalList[i]);
        iV.setImageResource(images[i]);
        return view;
    }
}
