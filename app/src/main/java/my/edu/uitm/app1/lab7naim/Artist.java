package my.edu.uitm.app1.lab7naim;

/**
 * Created by student22 on 10/30/17.
 */

public class Artist {
        String artistId;
        String artistName;

    public Artist(){}

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

}

