package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return new Product();

    }
    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        System.out.println(product);
        return product;
    }
}
