package TestCases;

import Services.Services;
import org.testng.annotations.Test;

public class TestCases {

    Services services=new Services();

    @Test
    public void register() throws InterruptedException {
        services.registerUser();
    }
}
