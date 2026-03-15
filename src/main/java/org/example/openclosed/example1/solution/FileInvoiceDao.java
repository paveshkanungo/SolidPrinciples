package org.example.openclosed.example1.solution;

public class FileInvoiceDao implements InvoiceDao{

    Invoice invoice;

    public FileInvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving to File.");
    }
}
