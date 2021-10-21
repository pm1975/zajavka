package day30.interfaces;

public interface Voiseable {

    String gimmeVoice();

    default void sing(String songName) {
        singMeASongWithName(songName);
    }

    private void singMeASongWithName(String songName) {
        System.out.println("Default singing song method: " + songName);
    }

}
