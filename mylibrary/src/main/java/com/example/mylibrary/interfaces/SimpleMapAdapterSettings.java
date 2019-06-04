package com.example.mylibrary.interfaces;

import android.view.View;

import java.util.Map;

public interface SimpleMapAdapterSettings {
    Object setViewHolder(View convertView);
    
    void setData(Object viewHolder, Map<String, Object> data);
}
