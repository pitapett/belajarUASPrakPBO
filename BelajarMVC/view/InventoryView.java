package BelajarMVC.view;

import java.util.ArrayList;

import BelajarMVC.controller.InventoryController;
import BelajarMVC.model.data.Item;
import BelajarMVC.model.data.ItemType;

import Utils.CLIUtil;

public class InventoryView {
    InventoryController inventoryController;

    public void setInventoryController(InventoryController inventoryController) {
        this.inventoryController = inventoryController;
    }

    public void render() {
        handleMenu();
    }

    public void printMenu() {
        System.out.println("menu");
        System.out.println("1. add item");
        System.out.println("2. view all items");
        System.out.println("0. exit");
    }

    public void handleMenu() {
        int menu = -1;

        while (menu != 0) {
            printMenu();
            menu = CLIUtil.getInt(); 

            switch (menu) {
                case 1:
                    addItemHandler();
                    break;
                case 2:
                    inventoryController.getAllItems();
                    break;
                case 0:
 
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    public void addItemHandler() {
        System.out.println("select type of item you want to add");
        System.out.println("1. Perishable");
        System.out.println("2. Electronic");
        int typeChoice = CLIUtil.getInt();
        ItemType type;
        if (typeChoice == 1) {
            type = ItemType.PERISHABLE;
        } else {
            type = ItemType.ELECTRONIC;
        }

        System.out.print("input name: ");
        String name = CLIUtil.getString();

        System.out.print("input stock");
        int stock = CLIUtil.getInt();

        System.out.print("input details");
        String details = CLIUtil.getString();

        inventoryController.addItem(name, stock, type, details);
    }

    public void printAllItem(ArrayList<Item> itemList) {
        for (Item item : itemList) {
            item.getDetails();
        }
    }
}
