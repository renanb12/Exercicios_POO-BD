public class Invoice {
    private int numberItem;
    private String descriptionItem;
    private int amount;
    private double unitPrice;

    public Invoice(int numberItem, String descriptionItem, int amount, double unitPrice) {
        this.numberItem = numberItem;
        this.descriptionItem = descriptionItem;
        this.amount = amount > 0 ? amount : 0;
        this.unitPrice = unitPrice > 0.0 ? unitPrice : 0.0;
    }

    public int getNumberItem() {
        return numberItem;
    }

    public void setNumberItem(int numberItem) {
        this.numberItem = numberItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public void setDescriptionItem(String descriptionItem) {
        this.descriptionItem = descriptionItem;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount > 0 ? amount : 0;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice > 0.0 ? unitPrice : 0.0;
    }

    public double getInvoiceValue() {
        return amount * unitPrice;
    }
}
