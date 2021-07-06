package com.iodroid.memoryLeak;

import android.content.Context;

public class GetDemoAsync {

        private static GetDemoAsync ourInstance;

        private Context context;

        static GetDemoAsync getInstance(Context context) {
            if (ourInstance == null) {
                ourInstance = new GetDemoAsync(context);
            }
            return ourInstance;
        }

        private GetDemoAsync(Context context) {
            this.context = context;
        }


        void startDownload(String url) {
            new DownloadFileTask(context,url).execute();
        }

    }

