package com.proyectoclase.e_comerce.ui.listOS;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.proyectoclase.e_comerce.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private static ArrayList<DataModel> dataSet;
    private static View.OnClickListener clickListener;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView name;
        TextView version;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.avatar = itemView.findViewById(R.id.avatar);
            this.name = itemView.findViewById(R.id.name);
            this.version = itemView.findViewById(R.id.version);
        }
    }
    public CustomAdapter(ArrayList<DataModel> dataSet) {
        this.dataSet = dataSet;
    }
    public  CustomAdapter.MyViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_listos, parent, false);
        view.setOnClickListener( clickListener);
        return new  CustomAdapter.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder( CustomAdapter.MyViewHolder holder, int position) {
        ImageView avatar = holder.avatar;
        TextView name = holder.name;
        TextView version = holder.version;
        avatar.setImageResource(dataSet.get(position).getImage());
        name.setText(dataSet.get(position).getName());
        version.setText(dataSet.get(position).getVersion());
    }
    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}
class DataModel {
    String name;
    String version;
    int id_;
    int image;
    DataModel(String name, String version, int id_, int image) {
        this.name = name;
        this.version = version;
        this.id_ = id_;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public String getVersion() {
        return version;
    }
    public int getImage() {
        return image;
    }
    public int getId() {
        return id_;
    }
}
class MyData {
    static String[] nameArray = {"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "JellyBean", "Kitkat", "Lollipop", "Marshmallow"};
    static String[] versionArray = {"1.5", "1.6", "2.0-2.1", "2.2-2.2.3", "2.3-2.3.7", "3.0-3.2.6", "4.0-4.0.4", "4.1-4.3.1", "4.4-4.4.4", "5.0-5.1.1", "6.0-6.0.1"};
    static Integer[] drawableArray = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair,
            R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ics,
            R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marsh};
    static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
}
