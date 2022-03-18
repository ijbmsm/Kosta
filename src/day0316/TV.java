package day0316;

public class TV implements Volume{

    int volLevel = 0;


    @Override
    public void volumeUp(int level) {
        volLevel += level;
        System.out.println("TV볼륨 올립니다. " + volLevel);
    }

    @Override
    public void volumeDown(int level) {
        volLevel += level;
        System.out.println("TV볼륨 내립니다. " + volLevel);
    }
}
