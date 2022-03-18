package day0317;

public class Speaker implements Volume{

    int volLevel = 0;

    @Override
    public int volumeUp(int Level) {
        if(volLevel + Level <= 100) return volLevel + Level;
        else volLevel = 100;
        return volLevel;
    }

    @Override
    public int volumeDown(int Level) {
        if(volLevel - Level >= 0) return volLevel - Level;
        else volLevel = 0;
        return volLevel;
    }
}
