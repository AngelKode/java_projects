package classes_inheritance;
public class Cars {
    private int speed;
    private String name;

    Cars(int _speed){
        this.speed = _speed;
    }
    Cars(String _name){this.name = _name;}
    Cars(int _speed, String _name){
        this.speed = _speed;
        this.name = _name;
    }
    public void increaseSpeed(){
        if(this.speed >= 200){
            System.out.println("Cant increase speed. Max speed reached...\n");
            return;
        }

        this.speed += 1;
        System.out.println("Speed increased...\n");
    }

    public void decreaseSpeed(){
        if(this.speed < 1){
            System.out.println("Cant decrease speed. Min speed reached...\n");
            return;
        }

        this.speed -= 1;
        System.out.println("Speed decreased...\n");
    }

    public String getName(){
        if(this.name.isEmpty()){
            return "IM AN UNNAMED CAR :(";
        }
        return "IM THE CAR NAMED: " + this.name;
    }
}
