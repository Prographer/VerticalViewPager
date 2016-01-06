package untv.lab.uclls.com.lockscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import untv.lab.uclls.com.lockscreen.adapter.HorizonScreenAdapter;
import untv.lab.uclls.com.lockscreen.service.ScreenService;

public class MainActivity extends AppCompatActivity {

    ViewPager horizontalViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalViewPager = (ViewPager) findViewById(R.id.horizontalViewPager);
        horizontalViewPager.setAdapter(new HorizonScreenAdapter(getSupportFragmentManager()));


        Intent intent = new Intent(this, ScreenService.class);
        startService(intent);
    }

}
