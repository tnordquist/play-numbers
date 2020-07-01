package edu.cnm.deepdive.playnumbers.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.playnumbers.model.entity.User;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;


@Dao
public interface UserDao {

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<Long> insert(User user);

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<List<Long>> insert(User... users);

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<List<Long>> insert(Collection<User> users);

  @Update
  Single<Integer> update(User... users);

  @Delete
  Single<Integer> delete(User... users);

  @Query("SELECT * FROM User ORDER BY name")
  LiveData<List<User>> selectAll();

}