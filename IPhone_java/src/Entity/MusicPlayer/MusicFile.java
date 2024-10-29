package Entity.MusicPlayer;

public class MusicFile implements Reproducer,Comparable<MusicFile> {

    private String musicName;
    private String musicFilePath;

    public MusicFile(String musicName,String musicFilePath) {
        this.musicName = musicName;
        this.musicFilePath = musicFilePath;
    }

    public String getMusicFilePath() {
        return musicFilePath;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
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

    @Override
    public int compareTo(MusicFile o) {
       return musicName.compareToIgnoreCase(o.musicName);
    }

    
}
