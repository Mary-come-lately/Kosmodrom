import java.util.Random;

public class SpaceX implements Rocket {
    @Override
    public boolean ready() {
        Random random = new Random();
        if(random.nextInt(10) > 5){
            return true;
        }
        else return false;
    }

    @Override
    public void engine_start() {
        System.out.println("Проверка успешна. Двигатели запущены");
    }

    @Override
    public void start() {
        System.out.println("Запуск ракеты");
    }
}
