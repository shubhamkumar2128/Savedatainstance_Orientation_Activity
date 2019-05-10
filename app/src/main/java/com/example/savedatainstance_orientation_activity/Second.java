package com.example.savedatainstance_orientation_activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends Fragment {
    TextView textView;
   int count;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.second, container, false);
        textView = v.findViewById(R.id.txtfragview);
        /*if (savedInstanceState == null) {

        } else {
            count = savedInstanceState.getInt("data");

        }*/textView.setText(String.valueOf(count));
        setRetainInstance(true);
        Log.w("msg", "Fragment OnCreateView()");
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("msg", "Fragment OnCreate()");

    }



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w("msg", "Fragment onSaveInstanceState()");


        //outState.putInt("data", count);

        Toast.makeText(getActivity(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w("msg", "Fragment onDestroy()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w("msg", "Fragment onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w("msg", "Fragment onStop()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w("msg", "Fragment onStart()");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.w("msg", "Fragment onAttach()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.w("msg", "Fragment onActivityCreated()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w("msg", "Fragment onResume()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.w("msg", "Fragment onDetach()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w("msg", "Fragment onDestroyView()");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.w("msg", "Fragment onViewStateRestored()");
    }


    public void add(int count) {
        this.count = count;
        textView.setText(String.valueOf(this.count));
    }
}
