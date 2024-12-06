
import javax.sound.sampled.SourceDataLine;

public class InvoiceItem {
    // Attributes of the InvoiceItem class
     String id;
     String description;
     int qty;
     double unitPrice;

    // Constructor to initialize the invoice item
    public InvoiceItem(String id, String description, int qty, double unitPrice) {
        this.id = id;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Getter for quantity 
    public int getQty() {
        return qty;
    }

    // Setter for quantity 
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for unitPrice
    public double getUnitPrice() {
        return unitPrice;
    }


    // Setter for unitPrice
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total (qty * unitPrice)
    public double getTotal() {
        return qty * unitPrice;
    }

    // Overriding the toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "InvoiceItem [id=" + id + ", description=" + description + ", qty=" + qty + ", unitPrice=" + unitPrice + ", total=" + getTotal() + "]";
    }

    //main class
    public static void main(String[] args) {
        
        //test item1
        InvoiceItem  invoice1 = new InvoiceItem("G127","AK47", 9,50000 );
        System.out.println(invoice1);

        //test for getters and setters
        //tester 2
        InvoiceItem  invoice2 = new InvoiceItem ("47","Tuber", 2, 30200);
        System.out.println(invoice2.toString());

        //tester 3
        InvoiceItem  invoice3 = new InvoiceItem ("jcopier","Hard", 1, 5000);
        System.out.println(invoice3.toString());



    }
}
