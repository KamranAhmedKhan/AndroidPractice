package ankita.myapplication.ServicesPractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import ankita.myapplication.R;

public class PracticeServices extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_practice_services);
    }

    public void startService(View view){
        startService (new Intent (this,MyService.class));
//        Toast.makeText (this, "Back to calling activity", Toast.LENGTH_SHORT).show ();
    }

    public void stopService(View view){
        stopService (new Intent (this, MyService.class));
    }
}
