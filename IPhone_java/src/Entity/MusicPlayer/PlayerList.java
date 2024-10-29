package Entity.MusicPlayer;

import java.util.HashSet;
import java.util.Set;

public class PlayerList {
    
    private Set<MusicFile> playerList;

    public PlayerList(){
        playerList = new HashSet<>();
    }

    public void addMusic(String musicName,String musicFilePath){
        playerList.add(new MusicFile(musicName, musicFilePath));
    }

    public void removeMusic(Set<MusicFile> removeMusic){
        playerList.removeAll(removeMusic);
    }

}
