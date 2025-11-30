package BelajarMVC.model.data;

public class ElectronicItem extends Item {
    private String electronicItemDetails;

    public ElectronicItem(String name, int stock, String electronicItemDetails) {
        super(name, stock);
        this.electronicItemDetails = electronicItemDetails;
    }

    @Override
    public void getDetails() {
        System.out.println(name + "is an Electronic Item w/ details: " + electronicItemDetails);

    }
}
