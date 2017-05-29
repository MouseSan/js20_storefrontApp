package ru.tsystems.js20.storefrontApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(getClass());

    public List<Product> getProductsList() {
        logger.debug("Getting product list from service");
        return productService.getAllProducts();
    }

}
