import java.util.Enumeration;

public abstract class Statement {
    
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
    
    protected abstract String getHeaderData(Customer aCustomer);

    protected abstract String getDataPerRental(Rental aRental);

    protected abstract String getFooterData(Customer aCustomer);
}
