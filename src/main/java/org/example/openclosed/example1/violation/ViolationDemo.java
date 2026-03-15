package org.example.openclosed.example1.violation;

public class ViolationDemo {
    public static void main(String[] args){
        Invoice invoice = new Invoice("123");

        InvoiceDao invoiceDao = new InvoiceDao(invoice);

        invoiceDao.saveToDB();
        invoiceDao.saveToFile();
    }
}
