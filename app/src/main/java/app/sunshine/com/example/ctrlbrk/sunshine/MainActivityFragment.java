package app.sunshine.com.example.ctrlbrk.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] strWeather = {"Today - Sunny - 88/63", "Tomorrow - Foggy -70/46",
                                     "Wed - Cloudy - 72/63", "Thur - Rainy - 64/51",
                                     "Friday - Foggy - 70/46","Sat - Windy -64/46 ",
                                     "Sunday - Sunny - 88/63"
                                    };
        List<String> weeklyForecast = new ArrayList<String>(Arrays.asList(strWeather));

        ArrayAdapter<string> forecastAdaptor = new ArrayAdapter<string>
                                                (
                                                        getActivity(), //context:  parent of the fragment.
                                                        R.layout.list_item_layout,
                                                        R.id.list_item_forecast,
                                                        weeklyForecast
                                                );
        ListView lview = (ListView) rootView.findViewById(R.id.listview_forecast);
        lview.setAdapter(forecastAdaptor);

        return rootView;

    }
}
