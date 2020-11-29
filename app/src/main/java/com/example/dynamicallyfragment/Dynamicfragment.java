package com.example.dynamicallyfragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
public class Dynamicfragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dynamicfragment, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // handle your fragment events here
    }
}