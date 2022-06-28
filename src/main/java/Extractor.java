import java.util.UUID;

public abstract  class Extractor {
    protected UUID id;
    protected int capacity;
    protected int quantity;

    public Extractor(int capacity, int quantity) {
        this.capacity = capacity;
        this.quantity = quantity;
    }

    public boolean checkExtractedPercent(int percent){
        return (quantity/capacity)*100 >= percent;
    }
}
