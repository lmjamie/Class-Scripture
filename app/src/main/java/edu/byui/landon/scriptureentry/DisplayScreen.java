package edu.byui.landon.scriptureentry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(GetScripture.EXTRA);

        TextView yourFav = new TextView(this);
        yourFav.setTextSize(20);

        yourFav.setText(message);
        setContentView(yourFav);
    }
}
