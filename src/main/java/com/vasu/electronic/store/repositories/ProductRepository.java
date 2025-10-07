package com.vasu.electronic.store.repositories;

  import com.vasu.electronic.store.entities.Category;
import com.vasu.electronic.store.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, String> {
    //search
    Page<Product> findByTitleContaining(String subTitle, Pageable pageable);

    Page<Product> findByLiveTrue(Pageable pageable);

    Page<Product> findByCategory(Category category,Pageable pageable);
    //other methods
    //custom finder methods
    //query methods
    Page<Product> findByPriceBetween(int minPrice, int maxPrice, Pageable pageable);


}
