package com.bignerdrach.android.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

/**
 * Created by m68476521 on 10/1/16.
 * This class is for assets management: finding assets, keeping tack of them,
 * and eventually playing them as sounds.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";
    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();

    }

    private void loadSounds() {
        String[] soundNames;
        try {
           soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG,  "found" + soundNames.length + " sounds");
        } catch (IOException ieo) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }
    }
}
