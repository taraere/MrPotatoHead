package com.elzen.tara.mrpotatohead;

/**
 * Created by Tara on 02/11/2017.
 */

public class ImageItem {

    final public int itemId;
    final public String itemName;

    public ImageItem(String itemName, int itemId) {
        this.itemName = itemName + ".png";
        this.itemId = itemId;
    }
}
