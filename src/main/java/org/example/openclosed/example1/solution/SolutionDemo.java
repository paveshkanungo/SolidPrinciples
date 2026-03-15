package org.example.openclosed.example1.solution;

public class SolutionDemo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("123");

        InvoiceDao databaseInvoice = new DatabaseInvoiceDao(invoice);
        InvoiceDao fileInvoice = new FileInvoiceDao(invoice);

        databaseInvoice.save();
        fileInvoice.save();
    }
}
