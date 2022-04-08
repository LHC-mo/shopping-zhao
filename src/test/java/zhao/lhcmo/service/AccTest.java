package zhao.lhcmo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccTest {
    @Autowired
    IAccountService accountService;

    @Test
    public void login(){
        System.out.println(accountService.login("admin","admin"));

    }
}
