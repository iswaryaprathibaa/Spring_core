package Hexaware.SpringCollections;

public class Items {
	int itemId;
	String itemName;
	public int getItemId() {
		return itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Items(int itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	public Items() {
		super();
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + "]";
	}
	
}
