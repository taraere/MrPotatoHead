package com.elzen.tara.mrpotatohead;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;

public class MrPotatoActivity extends AppCompatActivity {

    AlertDialog alertDialogStores;
    CheckBoxItem[] checkboxItems;

    public MrPotatoActivity() {
        checkboxItems = createCheckboxItemArray();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potato);
        showCheckBoxes();
    }

    public void showCheckBoxes() {
        final CheckBoxItem[] checkboxItemArray = createCheckboxItemArray();
        final CheckBoxAdapter adapter = new CheckBoxAdapter(this, R.layout.checkbox, checkboxItemArray);

        GridView gridView = new GridView(this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new OnItemClickListenerListViewItem());

        alertDialogStores = new AlertDialog.Builder(MrPotatoActivity.this)
                .setView(gridView)
                .setTitle("Mr Potato Head")
                .show();
    }

    public CheckBoxItem[] createCheckboxItemArray() {

        CheckBoxItem[] checkboxItems = new CheckBoxItem[10];

        checkboxItems[0] = new CheckBoxItem(0, R.id.arms, "Arms");
        checkboxItems[1] = new CheckBoxItem(1, R.id.shoes, "Shoes");
        checkboxItems[2] = new CheckBoxItem(2, R.id.ears, "Ears");
        checkboxItems[3] = new CheckBoxItem(3, R.id.eyebrows, "Eyebrows");
        checkboxItems[4] = new CheckBoxItem(4, R.id.eyes, "Eyes", true);
        checkboxItems[5] = new CheckBoxItem(5, R.id.glasses,  "Glasses");
        checkboxItems[6] = new CheckBoxItem(6, R.id.hat, "Hat");
        checkboxItems[7] = new CheckBoxItem(7, R.id.mouth, "Mouth", true);
        checkboxItems[8] = new CheckBoxItem(8, R.id.mustache, "Mustache");
        checkboxItems[9] = new CheckBoxItem(9, R.id.nose, "Nose");

        return checkboxItems;
    }

    private static class OnItemClickListenerListViewItem implements OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Context context = view.getContext();

            CheckBox checkBox = ((CheckBox) view.findViewById(R.id.grid_item_checkbox));

            // get the clicked item name
            String listItemText = checkBox.getText().toString();

            // get the clicked item ID
            String listItemId = checkBox.getTag().toString();

            // just toast it
            Toast.makeText(context, "Item: " + listItemText + ", Item ID: " + listItemId, Toast.LENGTH_SHORT).show();

            ((MrPotatoActivity) context).alertDialogStores.cancel();
        }

    }

    public void checkboxClicked(View view) {
        final boolean checked = ((CheckBox) view).isChecked();

        final int id = (int) view.getTag();

        // Error
        if (id < 0 || id >= checkboxItems.length) {
            return;
        }

        final CheckBoxItem checkBoxItem = checkboxItems[id];

        final ImageView bodyPart = findViewById(checkBoxItem.imageId);


        if (checked) {
            bodyPart.setVisibility(View.VISIBLE);
        } else {
            bodyPart.setVisibility(View.INVISIBLE);
        }
    }
}
