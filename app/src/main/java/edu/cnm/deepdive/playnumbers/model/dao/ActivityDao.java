package edu.cnm.deepdive.playnumbers.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.playnumbers.model.entity.Activity;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;


@Dao
public interface ActivityDao {

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<Long> insert(Activity activity);

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<List<Long>> insert(Activity... activities);

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<List<Long>> insert(Collection<Activity> activities);

  @Update
  Single<Integer> update(Activity... activities);

  @Delete
  Single<Integer> delete(Activity... activities);

  @Query("SELECT * FROM User ORDER BY name")
  LiveData<List<Activity>> selectAll();

}// TODO Define pojo (user with progress, activity with progress).