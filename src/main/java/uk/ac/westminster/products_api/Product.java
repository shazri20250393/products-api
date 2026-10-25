package uk.ac.westminster.products_api;

public class Product {
    private Long id= 2L;
    private String name = "Laptop";
    private Double price = 999.99;

    public Product(){

    }

    public Product(Long id, String name, Double price){
        this.id= id;
       this.name= name;
       this.price= price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
