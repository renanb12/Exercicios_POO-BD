//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Invoice item1 = new Invoice(1, "Keyboard", 2, 25.0);
        Invoice item2 = new Invoice(2, "Mouse", 3, -15.0);
        Invoice item3 = new Invoice(3, "Monitor", -1, 150.0);

        System.out.println("Invoice details:");
        System.out.println("Item Number:" + item1.getNumberItem());
        System.out.println("Item Description: " + item1.getDescriptionItem());
        System.out.println("Amount: " + item1.getAmount());
        System.out.println("Unit price: " + item1.getUnitPrice());
        System.out.println("Invoice amount: " + item1.getInvoiceValue());

        System.out.println("\nInvoice details (item with negative price and negative quantity):");
        System.out.println("Item Number:" + item2.getNumberItem());
        System.out.println("Item Description: " + item2.getDescriptionItem());
        System.out.println("Amount: " + item2.getAmount());
        System.out.println("Unit price: " + item2.getUnitPrice());
        System.out.println("Valor da Fatura: " + item2.getInvoiceValue());

        System.out.println("\nInvoice details (item with negative price and negative quantity):");
        System.out.println("Item Number:" + item3.getNumberItem());
        System.out.println("Item Description: " + item3.getDescriptionItem());
        System.out.println("Amount: " + item3.getAmount());
        System.out.println("Unit price: " + item3.getUnitPrice());
        System.out.println("Invoice amount: " + item3.getInvoiceValue());

    }
}