import java.util.Enumeration;
public class TextStatement extends Statement {
    
    private String getHeaderData(Customer aCustomer) { 
        return "Rental Record for " + 
                aCustomer.getName() +
                "\n";
    }

    private String getDataPerRental(Rental aRental) { 
        return "\t" + 
                aRental.getMovie().getTitle()+ 
                "\t" +
                String.valueOf(aRental.getCharge()) + 
                "\n";
    }

    private String getFooterData(Customer aCustomer) {
        return "Amount owed is " +
                String.valueOf(aCustomer.getTotalCharge()) + 
                "\n" +
                "You earned " +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeaderData(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getDataPerRental(each);
        }

        result += getFooterData(aCustomer);

        return result;
    }
}