package zhao.lhcmo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import zhao.lhcmo.pojo.Account;

public interface IAccountService extends IService<Account> {
    Account login(String accName, String password);
}
