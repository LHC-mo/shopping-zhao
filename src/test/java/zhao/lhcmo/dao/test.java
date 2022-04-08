package zhao.lhcmo.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zhao.lhcmo.pojo.Account;
import zhao.lhcmo.pojo.Emp;

@SpringBootTest
public class test {

    @Autowired
    private IAccountDao accountDao;


    @Test
    void TestGetByid() {
        Account account =new Account();
        System.out.println(accountDao.selectById(1));

    }


}
