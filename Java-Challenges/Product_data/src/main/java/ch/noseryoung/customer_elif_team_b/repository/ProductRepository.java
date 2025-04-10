package ch.noseryoung.customer_elif_team_b.repository;
import ch.noseryoung.customer_elif_team_b.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ProductRepository extends JpaRepository<Product, UUID>  {

}
