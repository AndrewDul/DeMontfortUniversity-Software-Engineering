package lib;

public class CDTrack {
    private String title;
    private String artist;
    private int duration;  // Duration in seconds

    // Default constructor
    public CDTrack() {
        this.title = "";
        this.artist = "";
        this.duration = 0;  // Initialize to zero
    }

    // Custom constructor
    public CDTrack(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration >= 0 ? duration : 0;  // Ensure non-negative duration
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration >= 0) {
            this.duration = duration;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "CDTrack:[title=" + title + ", artist=" + artist + ", duration=" + duration + "]";
    }
}
