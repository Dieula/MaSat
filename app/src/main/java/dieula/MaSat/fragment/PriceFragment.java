package dieula.MaSat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import dieula.MaSat.Adapter.ArrayAdapterFavori;
import dieula.MaSat.Models.favori;
import dieula.MaSat.R;
import dieula.MaSat.activities.DetailsActivity;


public class PriceFragment extends Fragment {

    ArrayAdapterFavori koutyeadapter;
    ArrayList<favori> aKoutye;
    ListView List;


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v = inflater.inflate(R.layout.fragment_price, container, false);

            List = (ListView)v.findViewById(R.id.lvGrid);

            List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(getActivity(), DetailsActivity.class);
                    startActivity(intent);
                }
            });

            aKoutye = new ArrayList<>();
            koutyeadapter = new ArrayAdapterFavori(getActivity(), aKoutye);
            List.setAdapter(koutyeadapter);

            koutyeadapter.addAll(favori.fromFakeData());
            koutyeadapter.notifyDataSetChanged();
            return v;
    }


}
