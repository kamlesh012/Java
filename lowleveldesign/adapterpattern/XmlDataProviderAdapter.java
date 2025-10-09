package adapterpattern;

public class XmlDataProviderAdapter implements IReport{
    public XmlDataProvider xmlDataProvider;
    public XmlDataProviderAdapter(XmlDataProvider xmlDataProvider){
        this.xmlDataProvider=xmlDataProvider;
    }

    public String convertXMLtoJSON(String XML){
        System.out.println("Converting XML Data: {"+XML+"} to JSON");
        return "JSON Data: {"+XML+"}";
    }
    
    @Override
    public String getJSONData(String Data){
        String xml=xmlDataProvider.getXMLData(Data);
        String  JsonData=convertXMLtoJSON(xml);
        return "Sending converted { "+JsonData+" }";
    }
    
};
