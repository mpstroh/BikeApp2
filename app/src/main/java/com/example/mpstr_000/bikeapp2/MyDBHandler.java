package com.example.mpstr_000.bikeapp2;

/**
 * Created by mpstr_000 on 4/3/2017.
 */
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.content.Context;
import android.content.ContentValues;

public class MyDBHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "RentalBikes.db";
    public static final String TABLE_BIKES = "Bikes";
    public static final String COLUMN_BIKENUMBER = "_bikeNumber";

    //We need to pass database information along to superclass
    public MyDBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_BIKES + "(" +
                COLUMN_BIKENUMBER + " TEXT PRIMARY KEY"
                ;
        db.execSQL(query);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BIKES);
        onCreate(db);
    }

    //Add a new row to the database
    public void addBike(Bikes bikeNumber){
        ContentValues values = new ContentValues();
        values.put(COLUMN_BIKENUMBER, bikeNumber.get_bikeNumber());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_BIKES, null, values);
        db.close();
    }

    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_BIKES + " WHERE 1";

        //Cursor points to a location in your results
        Cursor c = db.rawQuery(query, null);
        //Move to the first row in your results
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("bikeNumber")) != null) {
                dbString += c.getString(c.getColumnIndex("bikeNumber"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }

}
