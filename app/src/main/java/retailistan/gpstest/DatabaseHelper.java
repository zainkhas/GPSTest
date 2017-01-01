package retailistan.gpstest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kamal on 08-Dec-16.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private Context context;

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "GPSTest.db";
    private static final String TABLE_LOCATIONS = "locations";


    public DatabaseHelper(Context context) {
        super(context);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
