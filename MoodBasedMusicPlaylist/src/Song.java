public class Song {
    private String title;
    private String artist;
    private String url;
    private Mood mood;

    public Song(String title, String artist, String url, Mood mood) {
        this.title = title;
        this.artist = artist;
        this.url = url;
        this.mood = mood;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getUrl() {
        return url;
    }

    public Mood getMood() {
        return mood;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + mood + ") - " + url;
    }
}
