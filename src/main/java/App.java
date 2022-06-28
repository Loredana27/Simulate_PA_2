public class App {
    public static void main(String[] args) {
        OilExtractionBusiness extractionBusiness = new OilExtractionBusiness();

        FixedTerrestrial fixedTerrestrial = new FixedTerrestrial(10000, 2000, "");

        MobileTerrestrial mobileTerrestrial1 = new MobileTerrestrial(10000, 10000, "");
        MobileTerrestrial mobileTerrestrial2 = new MobileTerrestrial(10000, 2000, "");

        Offshore offshore = new Offshore(10000, 10000);
        Offshore offshore2 = new Offshore(10000, 10000);
        Offshore offshore3 = new Offshore(10000, 10000);

        extractionBusiness.addExtractor(mobileTerrestrial1);
        extractionBusiness.addExtractor(mobileTerrestrial2);
        extractionBusiness.addExtractor(fixedTerrestrial);
        extractionBusiness.addExtractor(offshore);
        extractionBusiness.addExtractor(offshore2);
        extractionBusiness.addExtractor(offshore3);

        offshore2.addWorker(new Worker("", Possition.MEDIC, 15));
        offshore3.addWorker(new Worker("", Possition.MEDIC, 10));

        System.out.println(extractionBusiness.getDevicesThatHaveExtractedMoreThen95());
        System.out.println(extractionBusiness.getNumberOfDevicesWithFaults());






    }
}
