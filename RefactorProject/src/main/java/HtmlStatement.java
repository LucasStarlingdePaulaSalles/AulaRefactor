import java.util.Enumeration;

public class HtmlStatement extends Statement {
  private String getHeaderData(Customer aCustomer) { 
    return "<H1>Rentals for <EM>" + 
            aCustomer.getName() + 
            "</EM></H1><P>\n";
  }

  private String getDataPerRental(Rental aRental) { 
    return aRental.getMovie().getTitle()+
            ": " +
            String.valueOf(aRental.getCharge()) + 
            "<BR>\n";
  }

  private String getFooterData(Customer aCustomer) {
    return "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + 
            "</EM><P>\n" +
            "On this rental you earned <EM>" + 
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
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