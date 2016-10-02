package com.bignerdrach.android.beatbox;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mike on 9/5/16.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {

        protected abstract Fragment createFragment();

        protected int getLayoutResId() {
            return R.layout.activity_fragment;
        }

        @Override
        public void onCreate(Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);
            setContentView(getLayoutResId());

            FragmentManager fm = getSupportFragmentManager();
            Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

            if (fragment == null) {
                fragment = createFragment();
                fm.beginTransaction()
                        .add(R.id.fragmentContainer, fragment)
                        .commit();
            }
        }
}
