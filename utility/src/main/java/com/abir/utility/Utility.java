package com.abir.utility;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;

public class Utility {
    Context context;

    public Utility(Context context) {
        this.context = context;
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        freeMemory();
    }

    public void freeMemory() {
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }

    /*
   ================ Show Toast Message ===============
   */
    public void showToast(Context c, String msg) {
        if (context == null) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(c, msg, Toast.LENGTH_LONG).show();
        }
    }
}
