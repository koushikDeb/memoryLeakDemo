package com.iodroid.memoryLeak;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

class DownloadFileTask extends AsyncTask<Void, Void, Void> {


    String TAG = "DownloadFilesTask";
    Context context;
    String imageurl;
    public DownloadFileTask(Context context, String url )
    {
        this.context=context;
        imageurl=url;
    }


    protected void onProgressUpdate(Void v) {
        Log.d(TAG,"Progress ");

    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d(TAG,"download start ");
        getBitmapFromURL(imageurl);
        return null;
    }

    protected void onPostExecute(Void v) {
        Log.d(TAG,"Downloaded "  + " bytes");
        Toast.makeText(context, "Download complete "+imageurl, Toast.LENGTH_SHORT).show();

    }

    public Bitmap getBitmapFromURL(String src) {
        try {
            java.net.URL url = new java.net.URL(src);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            Log.d(TAG,"download end ");
            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
