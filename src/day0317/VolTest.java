package day0317;

class VolTest {
    public static void main(String args[]){
        Volume[] v = new Volume[3];
        v[1] = new Speaker();
        v[2] = new Radio();
        for(int i = 0; i < v.length; i++){
            for(int j = 1; j <= 2; j++){
                v[i].volumeUp(200);
            }
            for(int j = 1; j <= 2; j++){
                v[i].volumeDown(300);
            }
        }
    }
}