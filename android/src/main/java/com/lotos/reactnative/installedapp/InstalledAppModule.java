package com.lotos.reactnative.installedapp;

import java.util.List;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

import android.content.pm.PackageManager;
import android.support.annotation.Nullable;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule;

public class InstalledAppModule extends ReactContextBaseJavaModule {

    protected ReactApplicationContext context;

    /**
     * @param reactContext
     */
    public InstalledAppModule(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    @Override
    public String getName() {
        return "InstalledApp";
    }

    @ReactMethod
    public void isApplicationInstalled(String packageName, Promise promise) {
        PackageManager packageManager = this.getReactApplicationContext().getPackageManager();
        boolean app_installed;
        try {
            packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            app_installed = false;
        }
        promise.resolve(app_installed);

    }
}
