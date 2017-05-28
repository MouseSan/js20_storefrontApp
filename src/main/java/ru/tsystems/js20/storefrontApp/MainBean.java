package ru.tsystems.js20.storefrontApp;

import ru.tsystems.js20.storefrontApp.model.Product;
import ru.tsystems.js20.storefrontApp.service.ProductService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class MainBean {

    @Inject
    private ProductService productService;

    public List<Product> getProductsList() {
        return productService.getAllProducts();
    }

}
