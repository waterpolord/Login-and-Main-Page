package com.proyectoclase.e_comerce.ui.listOS;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyectoclase.e_comerce.R;

import java.util.ArrayList;

public class listOSFragment extends Fragment {

    private listOSView listOSView;
    static String[] nameArray = {"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "JellyBean", "Kitkat", "Lollipop", "Marshmallow"};
    static String[] versionArray = {"1.5", "1.6", "2.0-2.1", "2.2-2.2.3", "2.3-2.3.7", "3.0-3.2.6", "4.0-4.0.4", "4.1-4.3.1", "4.4-4.4.4", "5.0-5.1.1", "6.0-6.0.1"};
    static Integer[] drawableArray = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair,
            R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.ics,
            R.drawable.jellybean, R.drawable.kitkat, R.drawable.lollipop, R.drawable.marsh};
    static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private ArrayList<DataModel> data;
    private RecyclerView recyclerView;
    @SuppressLint("ResourceType")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.recyclerview, container, false);
        data = new ArrayList<>();
        recyclerView = rootView.findViewById(R.id.recyclerId);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.versionArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }
        CustomAdapter adapter = new CustomAdapter(data);
        recyclerView.setAdapter(adapter);
        return rootView;
    }




}
