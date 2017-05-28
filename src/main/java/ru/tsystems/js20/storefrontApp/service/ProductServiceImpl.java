package ru.tsystems.js20.storefrontApp.service;

import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;
import ru.tsystems.js20.storefrontApp.model.Product;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class ProductServiceImpl implements ProductService {

    @Inject
    private WebService webService;

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    private void init() {
        products = Arrays.asList(webService.getProductListFromMainApp());
    }

    @Override
    public void updateProducts() {
        products = Arrays.asList(webService.getProductListFromMainApp());

        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/notify", String.valueOf("product list updated"));
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }
}
