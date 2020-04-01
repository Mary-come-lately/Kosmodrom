import java.util.Scanner;

public class Souz implements Rocket {
    @Override
    public boolean ready() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 0 или 1 для проверки старта: ");
        int x =scanner.nextInt();
        if( x == 0){
            return false;
        }
        else return true;
    }

    @Override
    public void engine_start() {
        System.out.println("Проверка успешна. Системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Запуск ракеты");
    }
}
