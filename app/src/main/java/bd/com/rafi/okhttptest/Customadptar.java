package bd.com.rafi.okhttptest;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Customadptar extends BaseAdapter {
     Context context;
     LayoutInflater inflater;
     ArrayList<Model2> model=new ArrayList<>();

    public Customadptar(Context context, ArrayList<Model2> model){
        this.context=context;
        inflater=(LayoutInflater.from(context));
        this.model=model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView =inflater.inflate(R.layout.listview,null);
        TextView t1=convertView.findViewById(R.id.id);
        TextView t2=convertView.findViewById(R.id.name);
        ImageView img=convertView.findViewById(R.id.imagelist);
        t1.setText(String.valueOf(model.get(position).getId()));
        t2.setText(model.get(position).getName());
        Picasso.get().load(model.get(position).getImage()).into(img);

        return convertView;
    }
}
