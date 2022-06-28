import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OilExtractionBusiness {
   private List<Extractor> extractors;

    public OilExtractionBusiness() {
        this.extractors = new ArrayList<>();
    }

    public int getNumberOfDevicesWithFaults(){
       return (int) extractors.stream().filter(e-> e instanceof Report).filter(e -> ((Report) e).reportFaults()).count();
    }

    public List<Extractor> getDevicesThatHaveExtractedMoreThen95(){
        return extractors.stream().filter(e -> e.checkExtractedPercent(95)).collect(Collectors.toList());
    }

    public void addExtractor(Extractor extractor){
        extractors.add(extractor);
    }

}
