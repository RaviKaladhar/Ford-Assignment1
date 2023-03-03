package Strings;

public class Shipment {
    private int id;
    private String shipperName;
    private String modeOfTransportation;
    private Float totalWeight;
    private String arrivalPort;
    private String departurePort;
    private static int nextShipmentId;
    static
    {
        nextShipmentId=1000;
    }

    public Shipment() {
    }

    public Shipment(int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort) {
        this.id = id;
        this.shipperName = shipperName;
        this.modeOfTransportation = modeOfTransportation;
        this.totalWeight = totalWeight;
        this.arrivalPort = arrivalPort;
        this.departurePort = departurePort;
    }
    public static Shipment createNewShipment(int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort)
    {
         return new Shipment(id,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);
    }
    public void display()
    {
        System.out.println(id);
        System.out.println(shipperName);
        System.out.println(modeOfTransportation);
        System.out.println(totalWeight);
        System.out.println(arrivalPort);
        System.out.println(departurePort);
    }
    public static void main(String []args)
    {
        Shipment shipment=Shipment.createNewShipment(1,"ragul","boat",500.8f,"SriLanka","India");
        shipment.display();
    }
}
