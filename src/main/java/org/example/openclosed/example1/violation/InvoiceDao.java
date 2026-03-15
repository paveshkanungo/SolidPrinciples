package org.example.openclosed.example1.violation;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Saving to DB");
    }

    public void saveToFile(){
        System.out.println("Saving to File");
    }

    // if incase, now, we need to add one more method like saveToMongoDB(), then
    // we are required to change this.
    // so, it is modifying this class, breaking the OCP.
}
