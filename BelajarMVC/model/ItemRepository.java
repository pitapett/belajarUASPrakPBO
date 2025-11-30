package BelajarMVC.model;

import java.util.ArrayList;

import BelajarMVC.model.data.Item;

public class ItemRepository {
    ArrayList<Item> itemList = new ArrayList<>();

    public ItemRepository(){

    }

    public void addItem(Item item) throws NullItemException{
        if (item == null) {
            throw new NullItemException();
        }
        itemList.add(item);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}
