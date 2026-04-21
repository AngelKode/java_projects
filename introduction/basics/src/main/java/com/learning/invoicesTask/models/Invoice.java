package com.learning.invoicesTask.models;

import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NonNull
public class Invoice {
    private int IDFolio;
    private String description;
    private Date dateOfPurchase;
    private Client relatedClient;
    private Product[] productsPurchased;

    public Invoice(int IDFolio, String description, Date dateOfPurchase, Client client, Product[] productsPurchased) {
        this.IDFolio = IDFolio;
        this.description = description;
        this.dateOfPurchase = dateOfPurchase;
        this.relatedClient = client;
        this.productsPurchased = productsPurchased;
    }

    public Invoice(int IDFolio, String description, Date dateOfPurchase, Client client, int numProductsPurchased) {
        this.IDFolio = IDFolio;
        this.description = description;
        this.dateOfPurchase = dateOfPurchase;
        this.relatedClient = client;
        this.productsPurchased = new Product[numProductsPurchased];
    }

    public Invoice(){
        this.IDFolio = 0;
        this.description = "EMPTY INVOICE. NO DATA RELATED";
        this.dateOfPurchase = null;
        this.relatedClient = null;
        this.productsPurchased = null;
    }

    public void setProductsPurchasedQuantity(int numberOfProductsPurchased){
        if(numberOfProductsPurchased < 0){
            throw new IllegalArgumentException("Number of products purchased is negative");
        }
        this.productsPurchased = new Product[numberOfProductsPurchased];
    }
}
