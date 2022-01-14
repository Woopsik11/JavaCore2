package JavaCore2.HomeWork.Lessons1;

public class Championship {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Tima", 3000, 300),
                new Cat("Vasya", 5000, 220),
                new Robot("Terminator", 99999, 1000),
                new Robot("Ipo", 5000, 300),
                new Human("Pasha", 7000, 150),
                new Human("Andrey", 10000, 200)
        };

        Trap[] traps = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall( 250)
        };

        for (Participant p : participants) {
            for (Trap t : traps) {
                if (!t.overcome(p)) break;
            }
        }
    }

}
