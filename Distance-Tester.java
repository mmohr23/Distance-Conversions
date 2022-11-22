public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        //
        Distance distance1 = new Distance(5.0);
        Distance distance2 = new Distance(20.0);
        Distance distance3 = new Distance(10.0);
        
        // Convert one to miles, one to leagues and
        // double one mileage
        distance1.toMiles();
        distance2.toLeagues();
        distance3.doubleMiles();
        
        //toMiles converts to miles. 
        
        
        // Print out the converted values
        // Use the getter!
        System.out.println(distance1.getKilometers() + " km = " + distance1.toMiles() + " miles");
        System.out.println(distance2.getKilometers() + " km = " + distance2.toLeagues() + " leagues");
        System.out.println(distance3.getKilometers() + " km = " + distance3.doubleMiles() + " miles (round trip)");
    }
}