public class MobileTerrestrial extends ExtractorWithLocation implements Report{
    public MobileTerrestrial(int capacity, int quantity, String location) {
        super(capacity, quantity, location);
    }

    @Override
    public boolean reportFaults() {
        return (capacity * 25) / 100 >= quantity;
    }

    public void changeLocation(String location){
        this.location = location;
    }
}
