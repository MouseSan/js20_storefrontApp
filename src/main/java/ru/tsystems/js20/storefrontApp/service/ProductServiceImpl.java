package ru.tsystems.js20.storefrontApp.service;

import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    Logger logger = LoggerFactory.getLogger(getClass());

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    private void init() {
        logger.debug("Initialize products service. Download product list");
        products = Arrays.asList(webService.getProductListFromMainApp());
    }

    @Override
    public void updateProducts() {
        logger.debug("Update product list");
        products = Arrays.asList(webService.getProductListFromMainApp());

        logger.debug("Send update notification to client");
        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/notify", String.valueOf("product list updated"));
    }

    @Override
    public List<Product> getAllProducts() {
        logger.debug("Getting product list");
        return products;
    }
}
