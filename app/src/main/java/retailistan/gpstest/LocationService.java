package retailistan.gpstest;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.SmartLocation;
import io.nlopez.smartlocation.location.providers.LocationGooglePlayServicesWithFallbackProvider;

/**
 * Created by Kamal on 08-Dec-16.
 */

public class LocationService extends Service {

    private static final String TAG = LocationService.class.getSimpleName();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        LocationGooglePlayServicesWithFallbackProvider provider = new LocationGooglePlayServicesWithFallbackProvider(this);

        SmartLocation.with(this).location(provider)
                .continuous()
                .start(new OnLocationUpdatedListener() {
                    @Override
                    public void onLocationUpdated(Location location) {

                        Log.d(TAG, "***********\nLat: " + location.getLatitude() + "\nLong: " + location.getLongitude());
                    }
                });

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        SmartLocation.with(this).location().stop();
        super.onDestroy();
    }
}
