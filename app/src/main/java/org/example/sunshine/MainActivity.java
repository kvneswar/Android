package org.example.sunshine;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public static class PlaceholderFragment extends Fragment{

        private ArrayAdapter<String> arrayAdapter;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_placeholder, container, false);

            List<String> list = Arrays.asList("Today - Sunny - 88/63",
                                              "Tomorrow - Foggy - 70/46",
                                              "Weds - Cloudy - 72/63",
                                              "Thurs - Rainy - 64/51",
                                              "Fri - Foggy - 70/46",
                                              "Sat - Sunny - 76/68",
                                              "Sun - Sunny - 92/69");

            arrayAdapter = new ArrayAdapter(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, list);
            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(arrayAdapter);
            return rootView;
        }

    }

}
