package com.example.heidifahim.rotri;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;

/**
 * Created by heidifahim on 16-07-18.
 */
public class RideListFragment extends Fragment implements OnItemClickListener{

    View myView;
    LinearLayout item2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.ridelist_layout, container,false);
        item2 = (LinearLayout) myView.findViewById(R.id.item2);
        item2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent item2Page = new Intent(getActivity(),RideActivity.class);
                startActivity(item2Page);
            }
        });
        return myView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
