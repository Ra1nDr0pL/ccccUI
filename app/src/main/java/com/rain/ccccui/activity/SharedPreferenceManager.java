package com.rain.ccccui.activity;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceManager {

    private static class SharedPreferenceProxy {

        private final SharedPreferences mSharedPreferences;
        private final SharedPreferences.Editor mEditor;

        public SharedPreferenceProxy(Context context, String sharedPreferencesName) {
            mSharedPreferences = context.getSharedPreferences(sharedPreferencesName, Context.MODE_PRIVATE);
            mEditor = mSharedPreferences.edit();
        }

        public void put(String key, Object value) {
            if (value instanceof String) {
                mEditor.putString(key, (String) value);
            } else if (value instanceof Integer) {
                mEditor.putInt(key, (Integer) value);
            } else if (value instanceof Long) {
                mEditor.putLong(key, (Long) value);
            } else if (value instanceof Float) {
                mEditor.putFloat(key, (Float) value);
            } else if (value instanceof Boolean) {
                mEditor.putBoolean(key, (Boolean) value);
            }
            mEditor.apply();
        }

        public void putString(String key, String value) {
            mEditor.putString(key, value);
            mEditor.apply();
        }

        public void putInt(String key, int value) {
            mEditor.putInt(key, value);
            mEditor.apply();
        }

        public void putLong(String key, long value) {
            mEditor.putLong(key, value);
            mEditor.apply();
        }

        public void putFloat(String key, float value) {
            mEditor.putFloat(key, value);
            mEditor.apply();
        }

        public void putBoolean(String key, boolean value) {
            mEditor.putBoolean(key, value);
            mEditor.apply();
        }

        public String getString(String key, String defaultValue) {
            return mSharedPreferences.getString(key, defaultValue);
        }

        public int getInt(String key, int defaultValue) {
            return mSharedPreferences.getInt(key, defaultValue);
        }

        public long getLong(String key, long defaultValue) {
            return mSharedPreferences.getLong(key, defaultValue);
        }

        public float getFloat(String key, float defaultValue) {
            return mSharedPreferences.getFloat(key, defaultValue);
        }

        public boolean getBoolean(String key, boolean defaultValue) {
            return mSharedPreferences.getBoolean(key, defaultValue);
        }

        public void remove(String key) {
            mEditor.remove(key);
            mEditor.apply();
        }

        public void clear() {
            mEditor.clear();
            mEditor.apply();
        }

        public SharedPreferences getSharedPreferences() {
            return mSharedPreferences;
        }

    }

    public static SharedPreferenceProxy getSP(Context context, String spName) {
        return new SharedPreferenceProxy(context, spName);
    }

}
