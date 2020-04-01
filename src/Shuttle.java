import java.util.Random;

public class Shuttle implements Rocket {

    @Override
    public boolean ready() {
        Random random = new Random();
        if(random.nextInt(10) > 3){
            return true;
        }
        else return false;
    }

    @Override
    public void engine_start() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла");
    }
}
