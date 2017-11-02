package com.elzen.tara.mrpotatohead;

/**
 * Created by Tara on 02/11/2017.
 */
public class CheckBoxItem {

    final public int itemId;
    final public int imageId;
    final public String itemName;
    final public boolean selected;

    public CheckBoxItem(int id, int imageId, String name) {
        this(id, imageId, name, false);
    }

    public CheckBoxItem(int id, int imageId, String name, boolean selected) {
        this.itemId = id;
        this.imageId = imageId;
        this.itemName = name;
        this.selected = false;
    }

}
