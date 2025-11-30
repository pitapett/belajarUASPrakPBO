package BelajarMVC.controller;

import java.util.ArrayList;

import BelajarMVC.model.ItemRepository;
import BelajarMVC.model.NullItemException;
import BelajarMVC.model.data.ElectronicItem;
import BelajarMVC.model.data.Item;
import BelajarMVC.model.data.ItemType;
import BelajarMVC.model.data.PerishableItem;
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

    public void addItem(String name, int stock, ItemType type, String details) {
        try {
            if (type == ItemType.PERISHABLE) {
                PerishableItem item = new PerishableItem(name, stock, details);
                itemRepository.addItem(item);
            } else {
                ElectronicItem item = new ElectronicItem(name, stock, details);
                itemRepository.addItem(item);
            }
        } catch (NullItemException nie) {
            System.out.println("item was null");
        }

    }

}
