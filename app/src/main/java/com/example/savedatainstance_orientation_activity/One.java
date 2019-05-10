package com.example.savedatainstance_orientation_activity;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class One extends Fragment {

    Button button;
    int count = 0;
    private comm Comm;

    public One() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_one, container, false);
        button = v.findViewById(R.id.send);
        /*if (savedInstanceState == null) {
            count = 0;
        } else {
            count = savedInstanceState.getInt("data");
        }*/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Comm.data(count);
            }
        });

        setRetainInstance(true);
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Comm = (One.comm) context;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        //outState.putInt("data", count);
    }

    public interface comm {
        void data(int count);
    }
}
