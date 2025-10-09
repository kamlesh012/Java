package adapterpattern;
import adapterpattern.XmlDataProvider;

public class client {
    public void getReport(IReport report, String rawData){
        System.out.println("Processed JSON: "+ report.getJSONData(rawData));
    }
};
