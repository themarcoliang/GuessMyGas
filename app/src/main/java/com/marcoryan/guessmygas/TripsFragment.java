package com.marcoryan.guessmygas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class TripsFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trips_fragment, container, false);

        ToggleButton togg = rootView.findViewById(R.id.toggle);
        togg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getContext(),"starting track", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getContext(),"ending track", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootView;
    }


}