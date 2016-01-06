package untv.lab.uclls.com.lockscreen.service;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Prograper on 2015-12-28.
 */
public class ScreenService extends Service {
    ScreenReceiver recevier = null;

    @Override
    public void onCreate() {
        super.onCreate();
        initReceiver();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (intent != null) {
            if (intent.getAction() == null && recevier == null) {
                initReceiver();
            }
        }

        return START_REDELIVER_INTENT;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if(recevier!=null){
            unregisterReceiver(recevier);
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void initReceiver() {
        recevier = new ScreenReceiver();
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_OFF);
        registerReceiver(recevier, filter);
    }
}
