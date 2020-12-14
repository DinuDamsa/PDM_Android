package com.deenoo.airport.data.local;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.deenoo.airport.data.Flight;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FlightDAO_Impl implements FlightDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Flight> __insertionAdapterOfFlight;

  private final EntityDeletionOrUpdateAdapter<Flight> __updateAdapterOfFlight;

  public FlightDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFlight = new EntityInsertionAdapter<Flight>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `flights` (`_id`,`userId`,`name`,`noPassengers`,`dateOfFlight`,`isFull`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Flight value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getNoPassengers());
        if (value.getDateOfFlight() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDateOfFlight());
        }
        final int _tmp;
        _tmp = value.isFull() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__updateAdapterOfFlight = new EntityDeletionOrUpdateAdapter<Flight>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `flights` SET `_id` = ?,`userId` = ?,`name` = ?,`noPassengers` = ?,`dateOfFlight` = ?,`isFull` = ? WHERE `_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Flight value) {
        if (value.get_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.get_id());
        }
        if (value.getUserId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        stmt.bindLong(4, value.getNoPassengers());
        if (value.getDateOfFlight() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDateOfFlight());
        }
        final int _tmp;
        _tmp = value.isFull() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        if (value.get_id() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.get_id());
        }
      }
    };
  }

  @Override
  public Object insert(final Flight flight, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFlight.insert(flight);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Flight flight, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFlight.handle(flight);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Flight>> getAll() {
    final String _sql = "SELECT * FROM flights";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"flights"}, false, new Callable<List<Flight>>() {
      @Override
      public List<Flight> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNoPassengers = CursorUtil.getColumnIndexOrThrow(_cursor, "noPassengers");
          final int _cursorIndexOfDateOfFlight = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOfFlight");
          final int _cursorIndexOfIsFull = CursorUtil.getColumnIndexOrThrow(_cursor, "isFull");
          final List<Flight> _result = new ArrayList<Flight>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Flight _item;
            final String _tmp_id;
            _tmp_id = _cursor.getString(_cursorIndexOfId);
            final String _tmpUserId;
            _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpNoPassengers;
            _tmpNoPassengers = _cursor.getInt(_cursorIndexOfNoPassengers);
            final String _tmpDateOfFlight;
            _tmpDateOfFlight = _cursor.getString(_cursorIndexOfDateOfFlight);
            final boolean _tmpIsFull;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFull);
            _tmpIsFull = _tmp != 0;
            _item = new Flight(_tmp_id,_tmpUserId,_tmpName,_tmpNoPassengers,_tmpDateOfFlight,_tmpIsFull);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Flight>> getAllByUserId(final String userID) {
    final String _sql = "SELECT * FROM flights WHERE userId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userID);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"flights"}, false, new Callable<List<Flight>>() {
      @Override
      public List<Flight> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNoPassengers = CursorUtil.getColumnIndexOrThrow(_cursor, "noPassengers");
          final int _cursorIndexOfDateOfFlight = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOfFlight");
          final int _cursorIndexOfIsFull = CursorUtil.getColumnIndexOrThrow(_cursor, "isFull");
          final List<Flight> _result = new ArrayList<Flight>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Flight _item;
            final String _tmp_id;
            _tmp_id = _cursor.getString(_cursorIndexOfId);
            final String _tmpUserId;
            _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpNoPassengers;
            _tmpNoPassengers = _cursor.getInt(_cursorIndexOfNoPassengers);
            final String _tmpDateOfFlight;
            _tmpDateOfFlight = _cursor.getString(_cursorIndexOfDateOfFlight);
            final boolean _tmpIsFull;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFull);
            _tmpIsFull = _tmp != 0;
            _item = new Flight(_tmp_id,_tmpUserId,_tmpName,_tmpNoPassengers,_tmpDateOfFlight,_tmpIsFull);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<Flight> getById(final String id) {
    final String _sql = "SELECT * FROM flights WHERE _id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"flights"}, false, new Callable<Flight>() {
      @Override
      public Flight call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfNoPassengers = CursorUtil.getColumnIndexOrThrow(_cursor, "noPassengers");
          final int _cursorIndexOfDateOfFlight = CursorUtil.getColumnIndexOrThrow(_cursor, "dateOfFlight");
          final int _cursorIndexOfIsFull = CursorUtil.getColumnIndexOrThrow(_cursor, "isFull");
          final Flight _result;
          if(_cursor.moveToFirst()) {
            final String _tmp_id;
            _tmp_id = _cursor.getString(_cursorIndexOfId);
            final String _tmpUserId;
            _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final int _tmpNoPassengers;
            _tmpNoPassengers = _cursor.getInt(_cursorIndexOfNoPassengers);
            final String _tmpDateOfFlight;
            _tmpDateOfFlight = _cursor.getString(_cursorIndexOfDateOfFlight);
            final boolean _tmpIsFull;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFull);
            _tmpIsFull = _tmp != 0;
            _result = new Flight(_tmp_id,_tmpUserId,_tmpName,_tmpNoPassengers,_tmpDateOfFlight,_tmpIsFull);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
