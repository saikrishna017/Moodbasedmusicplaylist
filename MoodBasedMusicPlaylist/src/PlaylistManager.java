import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlaylistManager {
    private List<Song> songs;

    public PlaylistManager() {
        songs = new ArrayList<>();
        loadSongs();
    }

    private void loadSongs() {
        songs.add(new Song("Happy Song", "Artist1", "https://youtu.be/happy", Mood.HAPPY));
        songs.add(new Song("Cheer Up", "Artist2", "https://youtu.be/cheerup", Mood.HAPPY));
        songs.add(new Song("Sad Melody", "Artist3", "https://youtu.be/sad", Mood.SAD));
        songs.add(new Song("Lonely Nights", "Artist4", "https://youtu.be/lonely", Mood.SAD));
        songs.add(new Song("You Can Do It", "Artist5", "https://youtu.be/motivated", Mood.MOTIVATED));
        songs.add(new Song("Work Hard", "Artist6", "https://youtu.be/workhard", Mood.MOTIVATED));
        songs.add(new Song("Romantic Evening", "Artist7", "https://youtu.be/romantic1", Mood.ROMANTIC));
        songs.add(new Song("Love Story", "Artist8", "https://youtu.be/romantic2", Mood.ROMANTIC));
    }

    public List<Song> getSongsByMood(Mood mood) {
        return songs.stream()
                .filter(song -> song.getMood() == mood)
                .collect(Collectors.toList());
    }
}
