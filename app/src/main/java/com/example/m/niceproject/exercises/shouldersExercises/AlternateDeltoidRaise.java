package com.example.m.niceproject.exercises.shouldersExercises;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m.niceproject.R;

public class AlternateDeltoidRaise extends Fragment {

    public AlternateDeltoidRaise() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.shoulders_alternate_deltoid_raise, container, false);
    }

}
