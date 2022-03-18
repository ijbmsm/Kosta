package day0316;

public class Speaker implements Volume{

    int volLevel=0;


    @Override
    public void volumeUp(int level) {
        if(volLevel + level <= 100) volLevel += level;
        else volLevel = 100;
        System.out.println("speak볼륨 올립니다. " + volLevel);
    }

    @Override
    public void volumeDown(int level) {
        if(volLevel - level >= 0) volLevel -= level;
        else volLevel = 0;
        System.out.println("speak볼륨 내립니다. " + volLevel);
    }
}
