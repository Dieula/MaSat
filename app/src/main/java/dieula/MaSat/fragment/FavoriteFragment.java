package dieula.MaSat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import dieula.MaSat.Adapter.KoutyeArrayAdapter;
import dieula.MaSat.Adapter.SlidingImage_Adapter;
import dieula.MaSat.Models.Koutye;
import dieula.MaSat.R;


public class FavoriteFragment extends Fragment {

    KoutyeArrayAdapter koutyeadapter;
    ArrayList<Koutye> aKoutye;
    ListView List;

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;

    private static final Integer[] IMAGES= {
            R.drawable.ma,
            R.drawable.ta,
            R.drawable.sa,

    };
    private ArrayList<Integer> ImagesArray = new ArrayList<Integer>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_favorite, container, false);

        for(int i=0;i<IMAGES.length;i++)
            ImagesArray.add(IMAGES[i]);

        mPager = (ViewPager) v.findViewById(R.id.ViewPager);


        mPager.setAdapter(new SlidingImage_Adapter(getActivity(),ImagesArray));


        CirclePageIndicator indicator = (CirclePageIndicator)
                v.findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES =IMAGES.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 5000, 5000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });




        List = v.findViewById(R.id.lvList);

          List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                  Intent intent = new Intent(getActivity(), VendreActivity.class);
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