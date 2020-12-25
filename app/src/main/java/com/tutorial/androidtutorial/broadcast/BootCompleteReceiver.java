package com.tutorial.androidtutorial.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

public class BootCompleteReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {

            boolean state= intent.getBooleanExtra("state",false);
            Log.i("Airplonemade", String.valueOf(state));

            PendingResult pendingResult = goAsync();

            Log.d(TAG, "onReceive: BOOT Adction");
            new Task(pendingResult, intent).execute();
        }
        PendingResult pendingResult = goAsync();

        Log.d(TAG, "");
        new Task(pendingResult, intent).execute();
    }

    private static class Task extends AsyncTask<Void, Void, Void> {
        PendingResult pendingResult;
        Intent intent;

        public Task(PendingResult pendingResult, Intent intent) {
            this.pendingResult = pendingResult;
            this.intent = intent;
        }

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                Log.d(TAG, "doInBackground: Work started");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d(TAG, "onPostExecute: Work Finished");
            pendingResult.finish();
        }
    }
}