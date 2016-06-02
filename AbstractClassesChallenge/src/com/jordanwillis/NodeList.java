package com.jordanwillis;

/**
 * Created by Jordan on 6/1/2016.
 */
public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
