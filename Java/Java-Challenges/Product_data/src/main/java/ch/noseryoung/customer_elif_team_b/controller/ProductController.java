package ch.noseryoung.customer_elif_team_b.controller;
import ch.noseryoung.customer_elif_team_b.model.Product;
import ch.noseryoung.customer_elif_team_b.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/")
public class ProductController {
    private final ProductService customerService;

    @Autowired
    public ProductController(ProductService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProduct() {
        return new ResponseEntity<>(customerService.getAllProduct(), HttpStatus.OK);
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<Product> getProductById(@Valid @PathVariable UUID customerId) {
        return new ResponseEntity<>(customerService.getProductById(customerId), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<Product> updateProduct(@Valid @PathVariable UUID id, @RequestBody Product details) throws Exception {
        return new ResponseEntity<>(customerService.updateCustomer(id, details), HttpStatus.OK);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<Void> deleteProduct(@Valid @PathVariable("productId") UUID customerId) {
        customerService.deleteProduct(customerId);
        return ResponseEntity.noContent().build();
    }


}