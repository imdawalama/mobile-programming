package com.example.jalbandi.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jalbandi.R;
import com.example.jalbandi.model.CustomGridViewModel;
import com.example.jalbandi.model.CustomModel;

import java.util.List;

public class CustomGridViewAdapter extends BaseAdapter {
    final Context context;
    final List<CustomGridViewModel> customGridViewModelList;

    public CustomGridViewAdapter(Context context, List<CustomGridViewModel> customGridViewModelList){
        this.context =context;
        this.customGridViewModelList = customGridViewModelList;

    }


    @Override
    public int getCount() {
        return customGridViewModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return customGridViewModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if (convertview == null) {
            convertview = LayoutInflater.from(context).inflate(R.layout.custom_listview_design,parent,false);
            CustomModel singleCustomModelData = (CustomModel) getItem(position);
            ImageView image = convertview.findViewById(R.id.image_view);
            TextView title = convertview.findViewById(R.id.txt_title);

            title.setText(singleCustomModelData.getTitle());
            image.setImageResource(singleCustomModelData.getImageResId());



        }
        return convertview;
    }
}
