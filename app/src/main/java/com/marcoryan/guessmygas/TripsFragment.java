package com.marcoryan.guessmygas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


public class TripsFragment extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.trips_fragment, container, false);

        CardView card = rootView.findViewById(R.id.card1);
        card.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(),"yes", Toast.LENGTH_SHORT).show();
    }

}