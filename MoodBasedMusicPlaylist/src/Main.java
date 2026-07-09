import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlaylistManager manager = new PlaylistManager();

        System.out.println("Select your mood:");
        for (Mood mood : Mood.values()) {
            System.out.println("- " + mood);
        }

        System.out.print("Enter mood: ");
        String moodInput = sc.nextLine().toUpperCase();

        try {
            Mood selectedMood = Mood.valueOf(moodInput);
            List<Song> playlist = manager.getSongsByMood(selectedMood);

            if (playlist.isEmpty()) {
                System.out.println("No songs found for this mood.");
            } else {
                System.out.println("Songs for mood: " + selectedMood);
                for (Song song : playlist) {
                    System.out.println(song);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid mood entered.");
        }

        sc.close();
    }
}
