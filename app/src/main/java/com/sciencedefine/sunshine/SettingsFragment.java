package com.sciencedefine.sunshine;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by naveenagrawal on 12-Aug-15.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.pref_general);
    }
}
