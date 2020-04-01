public class Start {
    public static void main(String[] args) throws InterruptedException {
        Kosmodrom rocket = new Kosmodrom(new Shuttle());
        rocket.start_rocket();
        System.out.println();
        Kosmodrom rock = new Kosmodrom(new SpaceX());
        rock.start_rocket();
        System.out.println();
        Kosmodrom roc = new Kosmodrom(new Souz());
        roc.start_rocket();
    }
}
