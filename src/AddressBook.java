import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private final List<BuddyInfo> buddies;  // 'final' keyword used as the list is not reassigned

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.buddies.add(buddy);
            System.out.println("Added: " + buddy.getName());  // Output for adding a buddy
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        if (this.buddies.contains(buddy)) {
            this.buddies.remove(buddy);
            System.out.println("Removed: " + buddy.getName());  // Output for removing a buddy
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Homer Simpson");

        // Adding BuddyInfo to AddressBook
        addressBook.addBuddy(buddy);

        // Removing BuddyInfo from AddressBook
        addressBook.removeBuddy(buddy);
    }
}
