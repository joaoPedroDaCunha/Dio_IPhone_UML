package Entity.MusicPlayer;

public class MusicFile implements Reproducer {

    private String musicFilePath;

    public MusicFile(String musicFilePath) {
        this.musicFilePath = musicFilePath;
    }

    public String getMusicFilePath() {
        return musicFilePath;
    }

    public void setMusicFilePath(String musicFilePath) {
        this.musicFilePath = musicFilePath;
    }

    @Override
    public void playe(String musicFilePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playe'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    
}
