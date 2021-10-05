package day30.interfaces;

public class Cat implements CatStrokeable, Voiseable {

    @Override
    public void doSomethingAsStrokeableCat() {
        System.out.println("I like being stroked!");
    }

    @Override
    public void beStroked() {
        System.out.println("I am stroked and it's really nice man!");
    }

    @Override
    public String gimmeVoice() {
        return "I'm giving Your my voice";
    }

//    @Override
//    public void sing(String songName) {
//        System.out.println("I'm singing the song: " + songName);
//    }
}
