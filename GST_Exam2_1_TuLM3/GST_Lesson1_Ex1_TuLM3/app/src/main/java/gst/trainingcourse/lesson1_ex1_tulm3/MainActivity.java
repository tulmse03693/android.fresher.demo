package gst.trainingcourse.lesson1_ex1_tulm3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    boolean isPressBackButton = false;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        isPressBackButton = true;

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(isPressBackButton){
            Log.d(TAG, getString(R.string.messBackButton));
        }else{
            Log.d(TAG, getString(R.string.messDestroy));
        }
    }

    public void onClickFinish(View view) {
        finish();
    }
}
