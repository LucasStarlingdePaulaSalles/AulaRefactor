public class TextStatement extends Statement {
    
    protected String getHeaderData(Customer aCustomer) { 
        return "Rental Record for " + 
                aCustomer.getName() +
                "\n";
    }

    protected String getDataPerRental(Rental aRental) { 
        return "\t" + 
                aRental.getMovie().getTitle()+ 
                "\t" +
                String.valueOf(aRental.getCharge()) + 
                "\n";
    }

    protected String getFooterData(Customer aCustomer) {
        return "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + 
                "\n" +
                "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }   
}