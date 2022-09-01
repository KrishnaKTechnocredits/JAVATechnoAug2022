package akankshaSharma;

class InterestCalculation{
    void simpleInterest(double p, double r, double t){
        double interest;
        interest = p*r*t/100;
        System.out.println("Simple Interest for Principle amount:- "+ p + " with rate " + r + "%" + " for "+ t + " time is: "+ interest);
        
    }
    
    void conversion(double temperature){
        temperature = (temperature -32)*5/9;
        System.out.println("Temperature in celsius is: "+ temperature);
    }
    
    
    
    
    public static void main(String[]args){
        InterestCalculation interestCalculation=new InterestCalculation();
        interestCalculation.simpleInterest(200.34, 4.5 , 2.5);
        interestCalculation.conversion(40);
    }
}







