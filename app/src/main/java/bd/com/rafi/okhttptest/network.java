package bd.com.rafi.okhttptest;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class network {
        Context context;
        public network(Context context){
            this.context=context;
        }
public void respons() {
    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder().header("token","2").url("http://api.piyasbiswas.com/apptesting/V1/doctorlist.php").build();
    client.newCall(request).enqueue(new Callback() {
        @Override
        public void onFailure(@NotNull Call call, @NotNull IOException e) {
            Log.e("fail","failed");
        }

        @Override
        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
            String a=response.body().string();

            ArrayList<Model>models;

            ((Activity) context).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                   // MainActivity.data=a;
                    MainActivity.fun(a);
                }
            });
                 Log.e("data",a);
        }
    });
}
}
