package adapterpattern;

public class adapterPattern {
    public static void main(String [] args){
        System.out.println("This is Adapter Pattern");
        
        XmlDataProvider xmlDataProvider=new XmlDataProvider();
        XmlDataProviderAdapter adapter=new XmlDataProviderAdapter(xmlDataProvider);
        client client=new client();
        client.getReport(adapter, "Raw Data");  

    }   
}
