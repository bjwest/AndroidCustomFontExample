package net.weslot.customfontexample;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
 *  Using custom fonts explained at http://code.tutsplus.com/tutorials/customize-android-fonts--mobile-1601
 *
 *  About 2/3 down.  Font file (TrueType (ttf) or OpenType (otf) both supported) should be placed in
 *  the assets folder under fonts (app/src/main/assests/fonts)
 *
  */
        TextView txt = (TextView) findViewById(R.id.hello_world);
        Typeface font = Typeface.createFromAsset(getAssets(), getString(R.string.custom_font));
        txt.setTypeface(font);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
