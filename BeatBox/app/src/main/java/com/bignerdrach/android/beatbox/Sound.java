package com.bignerdrach.android.beatbox;

import android.content.Intent;

/**
 * Created by m68476521 on 10/1/16.
 * Object responible for keeping track of the filename,
 * tne name the user should see, and any other related to that sound.
 */

public class Sound {
    private String mAssetPath;
    private String nName;
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String [] components = assetPath.split("/");
        String filename = components[components.length - 1];
        nName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return nName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
