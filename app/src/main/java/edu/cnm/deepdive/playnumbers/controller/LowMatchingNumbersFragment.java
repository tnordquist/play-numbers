package edu.cnm.deepdive.playnumbers.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.playnumbers.R;
import edu.cnm.deepdive.playnumbers.model.entity.Activity.Type;

/**
 * Hosts the actions that are implemented on the activity matchingNumbers for low numbers.
 */
public class LowMatchingNumbersFragment extends LearningActivityFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public Type getType() {
        return Type.MATCHING;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_low_matching_numbers;
    }

}