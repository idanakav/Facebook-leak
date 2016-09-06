package com.naco.facebookleak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.ads.MediaView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * At this point the {@link MediaView} has been initialized and added the
         * leaking {@link android.content.BroadcastReceiver}
         * to {@link android.support.v4.content.LocalBroadcastManager}
         * which is holding strong reference to this activity and will never be unregistered.
         *
         * The obscured name of the leaking receiver is {@link com.facebook.ads.internal.adapters.t}
         *
         * Note: the leak will happen as well if the
         * MediaView will be created programmatically i.e new MediaView(...)
         */
    }
}
