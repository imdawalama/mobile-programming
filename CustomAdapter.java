package com.example.jalbandi.utils;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jalbandi.R;
import com.example.jalbandi.model.CustomModel;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    final Context context;
    final List<CustomModel> customModelList;

    public CustomAdapter(Context context, List<CustomModel> customModelList) {
        this.context = context;
        this.customModelList = customModelList;
    }

    @Override
    public int getCount() {
        return customModelList.size();
    }

    @Override
    public Object getItem(int index) {
        return customModelList.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @Override
    public View getView(int index, View convertview, ViewGroup parent) {
        if (convertview == null) {
            convertview = LayoutInflater.from(context).inflate(R.layout.custom_listview_design, parent, false);
        }
        CustomModel singleCustomModelData = (CustomModel) getItem(index);
        ImageView image = convertview.findViewById(R.id.image_view);
        TextView title = convertview.findViewById(R.id.txt_title);
        TextView description = convertview.findViewById(R.id.txt_description);
        title.setText(singleCustomModelData.getTitle());
        image.setImageResource(singleCustomModelData.getImageResId());
        description.setText(singleCustomModelData.getDescription());
        return convertview;
    }
}
