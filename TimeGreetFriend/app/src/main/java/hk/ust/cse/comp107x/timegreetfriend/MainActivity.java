package hk.ust.cse.comp107x.timegreetfriend;

import android.app.Activity;
import android.app.ListActivity;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends ListActivity {

    //Button greetButton;
    String[] names;

    private static final String TAG = "ShowMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // get a reference to the greetButton on the UI
        // greetButton = (Button) findViewById(R.id.greetButton);
        // Set the onClickListener for the greetButton to be this class.
        // This requires that the class implement the View.OnClickListener callback
        // the onClick() method
        // greetButton.setOnClickListener(this);
        names = getResources().getStringArray(R.array.friends);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.friend_item, names));

        Log.i(TAG, "in onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "in onStart()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "in onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "in onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "in onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "in onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "in onDestroy()");
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

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        // The parameter "id" indicates the index of the item that was selected from
        // the list of friends. This is used to index into the names[] array to get
        // the name of the friend selected. Rest of the code is similar to the earlier
        // exercise.

        // create a new intent. The first parameter is the Context which is the current Activity.
        // Hence we use "this". The second parameter is the Activity class that we wish to start.
        // Hence it is specified as ShowMessage.class
        Intent in = new Intent(this,ShowMessage.class);

        // Add the message as a payload to the Intent. We add data to be carried by the intern using
        // the putExtra() methods. The data is specified as a key-value pair. The first parameter is
        // the key, specified as a string, and the second parameter is the value.
        in.putExtra("message", getString(R.string.greetstring) + names[(int) id] + "!");

        // We start the new activity by calling this method to inform the Android framework to start
        // the new activity. The parameter is the Intent we just created earlier
        startActivity(in);

    }

//    @Override
//    public void onClick(View v) {
//
//        // get a reference to the TextView on the UI
//        TextView textMessage = (TextView) findViewById(R.id.textMessage);
//
//        //get a reference to the EditText so that we can read in the value typed
//        // by the user
//        EditText editFriendName = (EditText) findViewById(R.id.editFriendName);
//
//        // get the name of the friend typed in by the user in the EditText field
//        String friendName = editFriendName.getText().toString();
//
//        // TODO 1
//        // Add the code to display the appropriate greeting message. Your output message should be exactly the same as the one you see on the video with exactly the same number of spaces in the same positions.
//        // The code from the previous exercise is commented and kept below for your reference
//        switch (v.getId()) {
//            case R.id.greetButton:
//                // set the string being displayed by the TextView to the greeting message for the friend
//                //get the hour
//                Date date = new Date();
//                Calendar cal = Calendar.getInstance();
//                cal.setTime(date);
//                int hour = cal.get(Calendar.HOUR_OF_DAY);
//
//                Intent intent = new Intent(this, ShowMessage.class);
//
////                if (hour >= 6 && hour < 12) {
////                    textMessage.setText(getString(R.string.goodmorning) + friendName + "!");
////                }
////                else if (hour < 17) {
////                    textMessage.setText(getString(R.string.goodafternoon) + friendName + "!");
////                }
////                else if (hour < 21) {
////                    textMessage.setText(getString(R.string.goodevening) + friendName + "!");
////                }
////                else {
////                    textMessage.setText(getString(R.string.goodnight) + friendName + "!");
////                }
//
//                intent.putExtra("message", getString(R.string.greetstring) + friendName + "!");
//
//                startActivity(intent);
//
//                break;
//
//            default:
//
//                break;
//        }
//
//    }
}
