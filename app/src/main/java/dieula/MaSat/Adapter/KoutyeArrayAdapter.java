package dieula.MaSat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import dieula.MaSat.Models.confiture;
import dieula.MaSat.R;

/**
 * Created by East Coast Pawn on 9/29/2017.
 */

public class KoutyeArrayAdapter  extends ArrayAdapter<confiture> {
    public KoutyeArrayAdapter(Context context, ArrayList<confiture> service) {
        super(context, android.R.layout.simple_list_item_1, service);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // get the data item for position
        confiture service = getItem(position);

        // check the existing view being reused
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_koutye, parent, false);
        }
      //  TextView  text1 = (TextView) convertView.findViewById(R.id.tvDescription);
        TextView  text = (TextView) convertView.findViewById(R.id.tvDetails);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageV);
        ImageView image = (ImageView) convertView.findViewById(R.id.ivCoeur);
        ImageView image1 = (ImageView) convertView.findViewById(R.id.ivLocalisation);


        text.setText(service.getTitle());
     //   text1.setText(service.getTitle1());
        image.setImageResource(service.getImage());
        image1.setImageResource(service.getImage1());
        imageView.setImageResource(service.getImage2());





        //Picasso.with(getContext()).load(koutyelist.getImage()).placeholder(R.drawable.ma).into(ivImage1);
        return convertView;
    }
}