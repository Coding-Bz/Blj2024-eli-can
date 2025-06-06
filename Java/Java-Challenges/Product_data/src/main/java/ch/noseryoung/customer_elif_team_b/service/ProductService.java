package ch.noseryoung.customer_elif_team_b.service;
import ch.noseryoung.customer_elif_team_b.model.Product;
import ch.noseryoung.customer_elif_team_b.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    private final ProductRepository productRepositoryRepository;


    @Autowired
    public ProductService(ProductRepository productRepository) {

        this.productRepositoryRepository = productRepository;
    }

    public Product createCustomer(Product product) {
        Product savedProduct = productRepositoryRepository.save(product);

        return savedProduct;
    }



    public Product updateCustomer(UUID productId, Product productDetails) {
        Product product = productRepositoryRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setEmail(productDetails.getEmail());
        product.setName(productDetails.getName());
        product.setPhone(productDetails.getPhone());
        product.setBirthday(productDetails.getBirthday());


        return productRepositoryRepository.save(product);
    }


    public List<Product> getAllProduct(){
        return productRepositoryRepository.findAll();
    }

    public Product getProductById(UUID productId) {
        return productRepositoryRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }



    public void deleteProduct(UUID productId) {
        Product product = productRepositoryRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        productRepositoryRepository.delete(product);
    }


}