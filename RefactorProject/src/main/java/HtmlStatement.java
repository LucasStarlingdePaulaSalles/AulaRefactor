public class HtmlStatement extends Statement {
    
  protected String getHeaderData(Customer aCustomer) { 
    return "<H1>Rentals for <EM>" + 
            aCustomer.getName() + 
            "</EM></H1><P>\n";
  }

  protected String getDataPerRental(Rental aRental) { 
    return aRental.getMovie().getTitle()+
            ": " +
            String.valueOf(aRental.getCharge()) + 
            "<BR>\n";
  }

  protected String getFooterData(Customer aCustomer) {
    return "<P>You owe <EM>" +
            String.valueOf(aCustomer.getTotalCharge()) + 
            "</EM><P>\n" +
            "On this rental you earned <EM>" + 
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points<P>";
  }
}