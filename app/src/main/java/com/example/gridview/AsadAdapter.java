package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AsadAdapter extends BaseAdapter {

    Context context;

    int[] flags;

    String[] countryNames;

    private LayoutInflater inflater;

    AsadAdapter (Context context, String[] countryNames, int[] flags){

        this.context = context;
        this.countryNames = countryNames;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.simple_view,viewGroup,false);
        }

        ImageView imageView = view.findViewById(R.id.imageViewId);
        TextView textView = view.findViewById(R.id.countryNameId);

        imageView.setImageResource(flags[i]);
        textView.setText(countryNames[i]);


        return view;
    }
}
