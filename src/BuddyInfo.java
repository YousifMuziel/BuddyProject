public class BuddyInfo {
    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer");
        System.out.println("Hello " + buddy.getName());
    }
}


//What is the name of the default folders and files that appear in the Java project folder? src/ out/ idea/
//Name three default Java libraries included in a Java project by IntelliJ.  java.lang java.util java.io
//The path where the file BuddyInfo.class lives /project-directory/out/production/Lab1/BuddyInfo.class
//The JAR file containing your completed BuddyInfo class which has a main method that instantiates a buddyInfo object and displays “Hello” followed by the name of the buddyInfo object. This JAR file should contain BOTH the source file and the executable.