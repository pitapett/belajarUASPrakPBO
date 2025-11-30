package BelajarMVC;

import BelajarMVC.controller.InventoryController;
import BelajarMVC.model.ItemRepository;
import BelajarMVC.view.InventoryView;

public class App {
    static void run() {
        ItemRepository itemRepository = new ItemRepository();
        InventoryView inventoryView = new InventoryView();
        InventoryController inventoryController = new InventoryController(itemRepository, inventoryView);
        inventoryView.setInventoryController(inventoryController);

        inventoryView.render();
    }

    public static void main(String[] args) {
        run();
    }
}
