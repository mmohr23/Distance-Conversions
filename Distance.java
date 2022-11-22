public class Distance
{
    //instance variables. 
    private double feet;
    private double centimeters;
    private double meters;
    private double kilometers;
    
    //constructor 
    public Distance(double theKilometers){
        kilometers = theKilometers;
    }
    
    //toMiles- divide kilometers by 1.609
    public double toMiles(){
        double miles = kilometers / 1.609;
        return miles;
    }
    
    //toLeagues- divide kilometers by 5.556
    public double toLeagues(){
        double leagues = kilometers / 5.556;
        return leagues;
    }
    
    
    //doubleMiles- miles *2
    public double doubleMiles(){
        return toMiles() *2;
    }
    
    
    //getKilometers- returns 
    public double getKilometers(){
        return kilometers;
    }
    

}