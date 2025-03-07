package tn.esprit.devops_project.services.Iservices;

import tn.esprit.devops_project.entities.Product;
import tn.esprit.devops_project.entities.ProductCategory;

import java.util.List;

public interface IProductService {

    Product addProduct(Product product, Long idStock);
    Product retrieveProduct(Long id);
    List<Product> retreiveAllProduct();
    List<Product> retrieveProductByCategory(ProductCategory category);
    void deleteProduct(Long id);
    List<Product> retreiveProductStock(Long id);

    // Ajouter les deux méthodes nécessaires
    Product applyDiscount(Long productId, float discountPercentage);  // Appliquer une remise sur un produit
    List<Product> getProductsOnDiscount();  // Gérer les produits en remise
}
