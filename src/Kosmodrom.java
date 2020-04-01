public class Kosmodrom {

    private Rocket rocket;

    public Kosmodrom(Rocket rocket) {
        this.rocket = rocket;
    }
    public Kosmodrom(){}

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start_rocket() throws InterruptedException {
        if(rocket.ready()){
            System.out.println("Предстартовая проверка провалена");
        }
        else {
            rocket.engine_start();
            System.out.println("Пошел обратный отсчет:");
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
                Thread.sleep(1000L);
            }
            rocket.start();
        }
    }


}
