package classes_inheritance;

public class Toyota extends Cars{
    private boolean hasTurbo;
    Toyota(int _speed, boolean _hasTurbo) {
        super(_speed);
        this.hasTurbo = _hasTurbo;
    }

    void turnOnAndroidAuto(){
        System.out.println("Android auto running...");
    }

    void removeTurbo(){
        this.hasTurbo = false;
    }
}
