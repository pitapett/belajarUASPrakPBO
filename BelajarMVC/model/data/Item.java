package BelajarMVC.model.data;

public abstract class Item {
    public String name;
    public int stock;
    public ItemType type;

    public Item(String name, int stock){
        this.name = name;
        this.stock = stock;
    }
    public abstract void getDetails();


}
