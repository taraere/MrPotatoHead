package com.elzen.tara.mrpotatohead;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class MrPotatoActivity extends AppCompatActivity {

    private static final String TAG_RETAINED_FRAGMENT = "DataFragment";

    private DataFragment mDataFragment;
    private CheckBoxItem[] checkboxItems;

    private AlertDialog alertDialogStores;


    public MrPotatoActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potato);

        // find the retained fragment on activity restarts
        FragmentManager fm = getFragmentManager();
        mDataFragment = (DataFragment) fm.findFragmentByTag(TAG_RETAINED_FRAGMENT);

        // create the fragment and data the first time
        if (mDataFragment == null) {
            // add the fragment
            mDataFragment = new DataFragment();
            fm.beginTransaction().add(mDataFragment, TAG_RETAINED_FRAGMENT).commit();
            // load data from a data source or perform any calculation
            mDataFragment.setCheckBoxItems(createCheckboxItemArray());
        }

        checkboxItems = mDataFragment.getCheckBoxItems();

        // the data is available in mRetainedFragment.getData() even after
        // subsequent configuration change restarts.

        for (CheckBoxItem item : checkboxItems) {
            checkChecked(item);
        }

        showCheckBoxes();
    }

    public void showCheckBoxes() {
        final CheckBoxAdapter adapter = new CheckBoxAdapter(this, R.layout.checkbox, checkboxItems);

        GridView gridView = new GridView(this);
        gridView.setAdapter(adapter);
//        gridView.setOnItemClickListener(new OnItemClickListenerListViewItem());

        alertDialogStores = new AlertDialog.Builder(MrPotatoActivity.this)
                .setView(gridView)
                .setTitle("Mr Potato Head")
                .show();
    }

    //TODO button and sidebar

    public CheckBoxItem[] createCheckboxItemArray() {

        CheckBoxItem[] checkboxItems = new CheckBoxItem[10];

        checkboxItems[0] = new CheckBoxItem(0, R.id.arms, "Arms");
        checkboxItems[1] = new CheckBoxItem(1, R.id.shoes, "Shoes");
        checkboxItems[2] = new CheckBoxItem(2, R.id.ears, "Ears");
        checkboxItems[3] = new CheckBoxItem(3, R.id.eyebrows, "Eyebrows");
        checkboxItems[4] = new CheckBoxItem(4, R.id.eyes, "Eyes", true);
        checkboxItems[5] = new CheckBoxItem(5, R.id.glasses,  "Glasses");
        checkboxItems[6] = new CheckBoxItem(6, R.id.hat, "Hat");
        checkboxItems[7] = new CheckBoxItem(7, R.id.mustache, "Mustache");
        checkboxItems[8] = new CheckBoxItem(8, R.id.mouth, "Mouth", true);
        checkboxItems[9] = new CheckBoxItem(9, R.id.nose, "Nose");

        return checkboxItems;
    }

    public void viewClicked(View view) {
        showCheckBoxes();
    }

    public void checkboxClicked(View view) {
        final boolean checked = ((CheckBox) view).isChecked();

        final int id = (int) view.getTag();

        // Error
        if (id < 0 || id >= checkboxItems.length) {
            return;
        }

        final CheckBoxItem checkBoxItem = checkboxItems[id];

        checkBoxItem.setSelected(checked);

        checkChecked(checkBoxItem);
    }

    private void checkChecked(CheckBoxItem checkBoxItem) {
        final ImageView bodyPart = findViewById(checkBoxItem.imageId);

        if (checkBoxItem.selected) {
            bodyPart.setVisibility(View.VISIBLE);
        } else {
            bodyPart.setVisibility(View.INVISIBLE);
        }

    }
}
