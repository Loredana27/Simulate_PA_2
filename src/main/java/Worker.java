public class Worker {
    public String name;
    private Possition possition;
    private int numberOfDay;

    public Worker(String name, Possition possition, int numberOfDay) {
        this.name = name;
        this.possition = possition;
        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public Possition getPossition() {
        return possition;
    }
}
