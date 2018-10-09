package compositionPattern;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }


    public void quack() {

        int leader = 3;

        for(Quackable q : quackers){
            if(quackers.indexOf(q) == 0){
                while(leader > 0){
                    q.quack();
                    leader -= 1;
                }
            }else{
                q.quack();
            }
        }
    }
}
