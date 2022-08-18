public class Vat{
    public static void main(String[] args){
        
        double totalAmount = 850.75;
        double vatPercentage = 12;
        double totalPaid = totalAmount + vatPercentage;
        
        
        System.out.println("Total Amount: " + totalPaid);
        
        vatPercentage = totalPaid * 3;
        
        System.out.println("Amount to be paid(3pax): " + vatPercentage);
        
        
    }
}










