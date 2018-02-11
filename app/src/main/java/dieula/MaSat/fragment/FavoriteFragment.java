package dieula.MaSat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import dieula.MaSat.R;
import dieula.MaSat.activities.CommandeActivity;
import dieula.MaSat.activities.DetailsActivity;


public class FavoriteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v =  inflater.inflate(R.layout.fragment_favorite, container, false);

        ImageView btnbuy = (ImageView) v.findViewById(R.id.btnbuy);
        btnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), CommandeActivity.class);
                startActivity(i);
            }
        });

        return v;
    }

}
