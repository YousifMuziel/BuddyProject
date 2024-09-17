import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<BuddyInfo> buddies;  // 'final' keyword added, and the list is initialized right away

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    public void displayBuddies() {
        for (BuddyInfo buddy : this.buddies) {
            System.out.println(buddy.getName());
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Homer Simpson");
        addressBook.addBuddy(buddy);
        System.out.println("Address Book:");
        addressBook.displayBuddies(); // Display all buddies to address the warning
        addressBook.removeBuddy(buddy);
    }
}
