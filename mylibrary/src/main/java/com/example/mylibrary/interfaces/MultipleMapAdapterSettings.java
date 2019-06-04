package com.example.mylibrary.interfaces;

import android.view.View;

import java.util.Map;

public interface MultipleMapAdapterSettings {
    Object setViewHolder(int type, View convertView);
    
    void setData(int type, Object viewHolder, Map<String, Object> data);
}