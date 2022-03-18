package day0317;

public class SmartPhone implements Alarm, Messenger, Phone{

    void print(){
        System.out.println("SmartPhone의 print 메서드입니다.");
    }

    @Override
    public void playMusic(String title) {
        System.out.println(title + " playMusic....");
    }

    @Override
    public void beep() {
        System.out.println("[비프음] 삑");
    }

    @Override
    public void 메세지전송() {
        System.out.println("You send the mail");
    }

    @Override
    public void 메세지받기() {
        System.out.println("You've got mail");
    }

    @Override
    public void 전화걸기() {
        System.out.println("전화중");
    }

    @Override
    public void 전화받기() {
        System.out.println("띠리링");

    }
}
