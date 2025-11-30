package BelajarMVC.controller;
import BelajarMVC.model.ItemRepository;
import BelajarMVC.model.NullItemException;
import BelajarMVC.model.data.Item;
import BelajarMVC.view.InventoryView;

public class InventoryController {
    private ItemRepository itemRepository;
    private InventoryView inventoryView;

    public InventoryController(ItemRepository itemRepository, InventoryView inventoryView) {
        this.inventoryView = inventoryView;
        this.itemRepository = itemRepository;
    }

    public void getAllItems() {
        if (itemRepository.getItemList().isEmpty()) {
            System.out.println("list is empty");
            return;
        }
        inventoryView.printAllItem(itemRepository.getItemList());
    }

    public void addItem(Item item) {
        try {
            itemRepository.addItem(item);
        } catch (NullItemException nie) {
            System.out.println("item was null");
        } finally {
            System.out.println("[LOG] add item was executed");
        }

    }

}
