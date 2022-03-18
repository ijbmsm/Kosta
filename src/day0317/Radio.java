package day0317;

public class Radio implements Volume{

    int volLevel = 0;


    @Override
    public int volumeUp(int Level) {
        volLevel += Level;
        return volLevel;
    }

    @Override
    public int volumeDown(int Level) {
        volLevel -= Level;
        return volLevel;
    }

}
