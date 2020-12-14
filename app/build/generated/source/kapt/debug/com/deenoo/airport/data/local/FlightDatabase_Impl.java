package com.deenoo.airport.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FlightDatabase_Impl extends FlightDatabase {
  private volatile FlightDAO _flightDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `flights` (`_id` TEXT NOT NULL, `userId` TEXT NOT NULL, `name` TEXT NOT NULL, `noPassengers` INTEGER NOT NULL, `dateOfFlight` TEXT NOT NULL, `isFull` INTEGER NOT NULL, PRIMARY KEY(`_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '676af0cc1d66742f4f77341cbd6ec950')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `flights`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFlights = new HashMap<String, TableInfo.Column>(6);
        _columnsFlights.put("_id", new TableInfo.Column("_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFlights.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFlights.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFlights.put("noPassengers", new TableInfo.Column("noPassengers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFlights.put("dateOfFlight", new TableInfo.Column("dateOfFlight", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFlights.put("isFull", new TableInfo.Column("isFull", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFlights = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFlights = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFlights = new TableInfo("flights", _columnsFlights, _foreignKeysFlights, _indicesFlights);
        final TableInfo _existingFlights = TableInfo.read(_db, "flights");
        if (! _infoFlights.equals(_existingFlights)) {
          return new RoomOpenHelper.ValidationResult(false, "flights(com.deenoo.airport.data.Flight).\n"
                  + " Expected:\n" + _infoFlights + "\n"
                  + " Found:\n" + _existingFlights);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "676af0cc1d66742f4f77341cbd6ec950", "91dbb1b36711b02ab1899ca5e32ae1cd");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "flights");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `flights`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FlightDAO flightDao() {
    if (_flightDAO != null) {
      return _flightDAO;
    } else {
      synchronized(this) {
        if(_flightDAO == null) {
          _flightDAO = new FlightDAO_Impl(this);
        }
        return _flightDAO;
      }
    }
  }
}
