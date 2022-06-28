import java.util.ArrayList;
import java.util.List;

public class Offshore extends Extractor implements Report {

    private List<Worker> essentialWorkers;
    public Offshore(int capacity, int quantity) {
        super(capacity, quantity);
        this.essentialWorkers = new ArrayList<>();
    }

    public void addWorker(Worker worker){
        essentialWorkers.add(worker);
    }

    @Override
    public boolean reportFaults() {
        return (!((capacity * 70) / 100 >= quantity ) ||
                essentialWorkers.stream().noneMatch(worker -> worker.getPossition().equals(Possition.MEDIC)) ||
                essentialWorkers.stream().anyMatch(worker -> worker.getNumberOfDay() >= 14));
    }
}
