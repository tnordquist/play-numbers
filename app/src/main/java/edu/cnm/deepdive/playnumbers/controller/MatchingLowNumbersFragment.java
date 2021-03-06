package edu.cnm.deepdive.playnumbers.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import edu.cnm.deepdive.playnumbers.R;
import edu.cnm.deepdive.playnumbers.model.entity.Activity.Type;

/**
 * Hosts the actions that are implemented on the activity match the low numbers.
 */
public class MatchingLowNumbersFragment extends LearningActivityFragment {

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    //TODO DO any additional process to set this.
    //TODO Add Text to Speech.
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override
  public Type getType() {
    return Type.MATCHING;
  }

  @Override
  public int getLayoutId() {
    return R.layout.fragment_matching_low_numbers;
  }

  //TODO Use Toast to display the "correct",  "wrong" + textSpeech.
}
