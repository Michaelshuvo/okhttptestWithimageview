package bd.com.rafi.okhttptest;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
      public static String data;
      static TextView t;
      String b="hah";
      ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.text);
        list=findViewById(R.id.list);
        // network network1=new network(MainActivity.this);
        // network1.respons();
        OkHttpClient client = new OkHttpClient();
        Request request=new Request.Builder().url("http://api.piyasbiswas.com/apptesting/V1/catslist.php").build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String a=response.body().string();

                ArrayList<Model2> lmodel=new ArrayList<>();
                Model2 model;
                try {

                    JSONArray jsonArray=new JSONArray(a);
                    for(int i=0;i<jsonArray.length();i++){
                        model=new Model2(Integer.parseInt(jsonArray.getJSONObject(i).getString("id")),
                                jsonArray.getJSONObject(i).getString("name"),
                                jsonArray.getJSONObject(i).getString("types"),
                                jsonArray.getJSONObject(i).getString("colorofeyes"),
                                jsonArray.getJSONObject(i).getString("image"));
                        lmodel.add(model);
                        Log.e("dataa",model.getName());
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                MainActivity.this.runOnUiThread(new Runnable() {
                   @Override
                   public void run() {

                      Customadptar adapte=new Customadptar(MainActivity.this,lmodel);
                      list.setAdapter(adapte);
                   }
               });
            }
        });

    }
    public static void fun(String a){
        t.setText(a);
    }
}
