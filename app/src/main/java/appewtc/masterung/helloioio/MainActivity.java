package appewtc.masterung.helloioio;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ToggleButton;

import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.BaseIOIOLooper;
import ioio.lib.util.android.IOIOActivity;


public class MainActivity extends IOIOActivity{

    private ToggleButton toggleButton1, toggleButton2, toggleButton3, toggleButton4, toggleButton5, toggleButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialWidget();

    }   // onCreate

    private void initialWidget() {
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        toggleButton3 = (ToggleButton) findViewById(R.id.toggleButton3);
        toggleButton4 = (ToggleButton) findViewById(R.id.toggleButton4);
        toggleButton5 = (ToggleButton) findViewById(R.id.toggleButton5);
        toggleButton6 = (ToggleButton) findViewById(R.id.toggleButton6);
    }   // initialWidget

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


    class Looper extends BaseIOIOLooper {
        @Override
        protected void setup() throws ConnectionLostException, InterruptedException {
            super.setup();
        }

        @Override
        public void loop() throws ConnectionLostException, InterruptedException {
            super.loop();
        }
    }


}   // Main Class
