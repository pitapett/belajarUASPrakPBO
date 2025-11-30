package BelajarMVC.model.data;
public class PerishableItem extends Item {
    private String perishableItemDetails;

    public PerishableItem(String name, int stock, String perishableItemDetails){
        super(name, stock);
        this.perishableItemDetails = perishableItemDetails;
    }

    @Override
    public void getDetails() {
        System.out.println(name + " is a Perishable Item w/ details: " + perishableItemDetails);

    }
}
