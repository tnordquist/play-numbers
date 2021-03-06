package edu.cnm.deepdive.playnumbers.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.playnumbers.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Represents the inflation of a host fragment for missingNumber activity by creating a new class
 * name. It holds the arguments of a child fragment and covering the appearing exceptions.
 */
public class MissingHostFragment extends Fragment {

  private View root;


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    try {
      root = inflater.inflate(R.layout.fragment_missing_host, container, false);
      View activityContainerMissing = root.findViewById(R.id.activity_container_missing);
      MissingHostFragmentArgs args = MissingHostFragmentArgs.fromBundle(getArguments());
      String className = args.getClassName();
      Class clazz = Class.forName(className);
      Constructor<LearningActivityFragment> constructor = clazz.getConstructor();
      LearningActivityFragment fragment = constructor.newInstance();

      getChildFragmentManager().beginTransaction()
          .replace(R.id.activity_container_missing, fragment, fragment.getClass().getName())
          .commit();
      return root;
    } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException
        | java.lang.InstantiationException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
