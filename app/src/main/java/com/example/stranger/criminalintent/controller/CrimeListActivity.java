package com.example.stranger.criminalintent.controller;

import android.support.v4.app.Fragment;

import com.example.stranger.criminalintent.SingleFragmentActivity;


/**
 * Created by stranger on 12/21/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
