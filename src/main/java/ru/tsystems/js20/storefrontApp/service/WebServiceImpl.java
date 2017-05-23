package ru.tsystems.js20.storefrontApp.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import ru.tsystems.js20.storefrontApp.Product;

import javax.ejb.Stateless;

@Stateless(name = "webService")
public class WebServiceImpl implements WebService {

    @Override
    public Product[] getProductListFromMainApp() {
        DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
        defaultClientConfig.getClasses().add(JacksonJsonProvider.class);
        Client client = Client.create(defaultClientConfig);
        WebResource webResource = client.resource("http://localhost:8080/getTopProductsList");
        ClientResponse resp = webResource.accept("application/json").get(ClientResponse.class);
        Product[] products = resp.getEntity(Product[].class);
        return products;
    }
}