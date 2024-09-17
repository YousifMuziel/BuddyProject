public class BuddyInfo {
    private final String name;  // 'final' keyword added as the name does not change

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer Simpson");
        System.out.println("Hello, " + buddy.getName());
    }
}
