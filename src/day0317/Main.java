package day0317;

public class Main {
    public static void main(String[] args) {
        use(new SmartPhone());
    }
    private static void use(Alarm alarm){
        alarm.beep();
        alarm.playMusic("Bye");
    }

    private static void f1(){
        Alarm alarm = new SmartPhone();
        alarm.playMusic("μΌμν");
        alarm.beep();
    }
}
