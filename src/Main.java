import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles ={new Circle(001,"Computer Science",null,null),
                new Circle(002,"Economy",null,null),
                new Circle(003,"Education",null,null)};
        for(int i=0; i< circles.length;i++){
            circles[i].printBasicData();
        }
    }
}