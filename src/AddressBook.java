import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        System.out.println("Address book");

        // Create a BuddyInfo object
        BuddyInfo buddy = new BuddyInfo("Homer");
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
