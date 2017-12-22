package com.example.stranger.criminalintent.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.stranger.criminalintent.R;
import com.example.stranger.criminalintent.SingleFragmentActivity;
import com.example.stranger.criminalintent.controller.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity{


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
