package edu.cnm.deepdive.playnumbers.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.playnumbers.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MatchingHostFragment extends Fragment {

  private View root;


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    try {
      root = inflater.inflate(R.layout.fragment_matching_host, container, false);
      View activityContainer = root.findViewById(R.id.activity_container);
      MatchingHostFragmentArgs args = MatchingHostFragmentArgs.fromBundle(getArguments());
      String className = args.getClassName();
      Class clazz = Class.forName(className);
      Constructor<LearningActivityFragment> constructor = clazz.getConstructor();
      LearningActivityFragment fragment = constructor.newInstance();

      getChildFragmentManager().beginTransaction()
          .replace(R.id.activity_container, fragment, fragment.getClass().getName())
          .commit();                                          //to put a fragment in place
      return root;
    } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
        | java.lang.InstantiationException | InvocationTargetException e) {
     throw new RuntimeException(e);
    }
  }
}
