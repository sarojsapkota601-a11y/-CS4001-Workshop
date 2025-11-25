import java.util.Scanner;
public class RickshawFare {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        final double baseFee= 50.0d;
        double ratePerKm=20.0d;
        double ratePerMinute=1.0d;//this is the fixed value of rickshaw
        
        System.out.println("----RIcksfare calculator---");
        // asking to the customer
        System.out.println("Enter distance (km):");
        int distance =sc.nextInt();
        
        System.out.println("Enter time(minutes):");
        int timeMinutes =sc.nextInt();
        
        
        System.out.println("Is customer local(Y/N)?");
        String localInput =sc.next();
        localInput=localInput.toUpperCase();
        char charLocalInput = localInput.charAt(0);
        
        
        System.out.println("Is travel nightime(Y/N)?");
        String nightInput =sc.next();
        nightInput=nightInput.toUpperCase();
        char charNightInput = nightInput.charAt(0);    
    
        sc.close();
        //close scanner
        
        //calculation of grossfare
        double grossfare=baseFee+(distance*ratePerKm)+(timeMinutes*ratePerMinute);
        
        grossfare=(charLocalInput == 'Y') ? grossfare * 0.9 : grossfare; //10% discount for locals
        
        grossfare=(charNightInput == 'Y') ? grossfare + 500 : grossfare; //20% surcharge for night travels.
        
        System.out.println("Rs:"+grossfare);
        
        
         //apply for discount for locals
        
         
         //apply for night time trabel
         
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        
        
         
        
        
        
        
        
        
        
    }
}