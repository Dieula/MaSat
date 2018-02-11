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

import dieula.MaSat.Adapter.KoutyeArrayAdapter;
import dieula.MaSat.Models.Koutye;
import dieula.MaSat.R;
import dieula.MaSat.activities.DetailsActivity;


public class FavoriteFragment extends Fragment {

    KoutyeArrayAdapter koutyeadapter;
    ArrayList<Koutye> aKoutye;
    ListView List;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_favorite, container, false);


        List = v.findViewById(R.id.lvList);

          List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  Intent intent = new Intent(getActivity(), DetailsActivity.class);
                  startActivity(intent);
              }
          });

        aKoutye = new ArrayList<>();
        koutyeadapter = new KoutyeArrayAdapter(getActivity(), aKoutye);
        List.setAdapter(koutyeadapter);

        koutyeadapter.addAll(Koutye.fromFakeData());
        koutyeadapter.notifyDataSetChanged();
        return v;
    }

}