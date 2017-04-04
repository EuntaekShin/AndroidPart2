package com.example.demonservice;

/**
 * Created by user on 2017-03-22.
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class DaemonService extends Service {

    public void onCreate(){
        super.onCreate();
        Toast.makeText(this,"on Crate 호출", Toast.LENGTH_LONG).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int sId) {
        Toast.makeText(this,"onStartCommand호출", Toast.LENGTH_LONG).show();
        return START_STICKY; //해당서비스가 강제종료될때 재시작 시키겠다
       // return START_NOT_STICKY
        // return START_REDELIVER_INTENT// 인텐트 값을 그대로 유지 하며 재시작
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy 메서드 호출", Toast.LENGTH_LONG).show();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
