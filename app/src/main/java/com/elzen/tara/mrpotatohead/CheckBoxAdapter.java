package com.elzen.tara.mrpotatohead;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

/**
 * Created by Tara on 02/11/2017.
 */

public class CheckBoxAdapter extends ArrayAdapter<CheckBoxItem> {

    final Context mContext;
    final int layoutResourceId;
    final CheckBoxItem data[];

    public CheckBoxAdapter(Context mContext, int layoutResourceId, CheckBoxItem[] data) {
        super(mContext, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        // object item based on the position
        CheckBoxItem objectItem = data[position];

        // get the TextView and then set the text (item name) and tag (item ID) values
        CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.grid_item_checkbox);
        checkBox.setText(objectItem.itemName);
        checkBox.setTag(objectItem.itemId);
        checkBox.setChecked(objectItem.selected);

        return convertView;
    }


    private static class ViewHolder {
        CheckBox checkBox;
    }


}
