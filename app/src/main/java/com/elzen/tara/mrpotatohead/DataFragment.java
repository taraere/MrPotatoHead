package com.elzen.tara.mrpotatohead;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by Tara on 05/11/2017.
 */

public class DataFragment extends Fragment {

    // data object retained
    private CheckBoxItem[] checkboxItems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }

    public void setCheckBoxItems(CheckBoxItem[] data) {
        this.checkboxItems = data;
    }

    public CheckBoxItem[] getCheckBoxItems() {
        return checkboxItems;
    }
}
