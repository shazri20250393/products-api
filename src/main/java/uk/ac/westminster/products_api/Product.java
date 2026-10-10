package uk.ac.westminster.products_api;

public class Product {
    public Long id= 2L;
    public String name = "Laptop";
    public Double price = 999.99;

    public Product(){

    }

    public Product(Long id, String name, Double price){
        this.id= id;
       this.name= name;
       this.price= price;
    }


}
