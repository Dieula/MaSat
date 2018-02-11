package dieula.MaSat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import dieula.MaSat.Models.favori;
import dieula.MaSat.R;

/**
 * Created by East Coast Pawn on 1/13/2018.
 */

public class ArrayAdapterFavori  extends ArrayAdapter<favori> {
    public ArrayAdapterFavori(Context context, ArrayList<favori> service) {
        super(context, android.R.layout.simple_list_item_1, service);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get the data item for position
        favori service = getItem(position);

        // check the existing view being reused
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_favori, parent, false);
        }

        TextView text = (TextView) convertView.findViewById(R.id.tvDetails);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageV);
        ImageView image = (ImageView) convertView.findViewById(R.id.ivCoeur);



        text.setText(service.getTitle());
        image.setImageResource(service.getImage());
        imageView.setImageResource(service.getImage2());


        //Picasso.with(getContext()).load(koutyelist.getImage()).placeholder(R.drawable.ma).into(ivImage1);
        return convertView;
    }}
