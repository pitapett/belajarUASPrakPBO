package BelajarMVC;

import BelajarMVC.controller.InventoryController;
import BelajarMVC.model.ItemRepository;
import BelajarMVC.model.data.Item;
import BelajarMVC.view.InventoryView;

public class App {

    public static void main(String[] args) {
        ItemRepository itemRepository = new ItemRepository();
        InventoryView inventoryView = new InventoryView();
        InventoryController inventoryController = new InventoryController(itemRepository, inventoryView);
        inventoryView.setInventoryController(inventoryController);

        Item mysteryItem = new Item("mystery", 1) {

            @Override
            public void getDetails() {
                System.out.println("mystery ni bg");
            }

        };
        try {
            itemRepository.addItem(mysteryItem);
        } catch (Exception e) {
            System.out.println("mysterynya throw e");
        }

        inventoryView.render();

    }
}
