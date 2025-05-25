package TestCases;

import Service.Services;
import Service.WebServices;
import org.testng.annotations.Test;

public class TestCases {

    Services services=new Services();

    WebServices webServices=new WebServices();

    @Test
    public void getAllProduct() throws InterruptedException {
        services.getAllProduct();
    }

    @Test
    public void getProductByIdOne(){
        services.getProductById();
    }

    @Test
    public void getProductByIdTwo(){
        services.getProductByIdTwo();
    }

    @Test
    public void openBrowserAndVisitWebsite() throws InterruptedException {
        webServices.openBrowserToVisitWebsite();
    }
}
