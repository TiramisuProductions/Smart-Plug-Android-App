package smartplug.app.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class TurnOnDeviceActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turn_on_device);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Turn on your smart device");
        setSupportActionBar(toolbar);

    }

    public void done(View view){
       startActivity(new Intent(TurnOnDeviceActivity.this,BluetoothDevices.class));
    }

}
