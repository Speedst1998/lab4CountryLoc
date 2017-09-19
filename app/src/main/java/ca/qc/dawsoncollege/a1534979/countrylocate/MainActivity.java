package ca.qc.dawsoncollege.a1534979.countrylocate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.*;
import android.net.Uri;
import android.content.Intent;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void onFlagClick(View v){
        Uri uri = Uri.parse("geo:0,0?q="+getString(R.string.country));
        showMap(uri);
    }
}
