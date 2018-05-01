package com.android.stunningbdg;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.stunningbdg.R;

/**
 * Created by ASUS on 11/04/2018.
 */

public class AdapterWisata extends ArrayAdapter <Wisata> {

   static class ViewHolder {
       public TextView review;
       public TextView rank;
       public TextView nama;
   }

    public Activity context;
    public int textViewResourceId;

    public AdapterWisata(Activity context, int textViewResourceId) {
        super(context, textViewResourceId);
        this.context=context;
        this.textViewResourceId=textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        if(convertView == null) {
            LayoutInflater layoutinflater = context.getLayoutInflater();
            view = layoutinflater.inflate(textViewResourceId,null);
            ViewHolder viewholder = new ViewHolder();
            viewholder.review=(TextView) view.findViewById(R.id.review);
            viewholder.rank=(TextView) view.findViewById(R.id.rank);
            viewholder.nama=(TextView) view.findViewById(R.id.nama);
            view.setTag(viewholder);
        } else {
            view = convertView;
        }
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        Wisata wisata = getItem(position);
        viewHolder.review.setText(wisata.getReview());
        viewHolder.nama.setText(wisata.getNama());
        viewHolder.rank.setText(wisata.getRank());

        return view;
    }
}
