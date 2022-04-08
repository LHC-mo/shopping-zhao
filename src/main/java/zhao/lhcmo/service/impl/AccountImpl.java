package zhao.lhcmo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhao.lhcmo.dao.IAccountDao;
import zhao.lhcmo.pojo.Account;
import zhao.lhcmo.service.IAccountService;
@Service
public class AccountImpl extends ServiceImpl<IAccountDao, Account> implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public Account login(String accName, String password) {
        //设置null检查
        if(accName==null||password==null){
            return null;
        }
        //设置QueryWrapper查询条件
        QueryWrapper<Account> wrapper = new QueryWrapper<>();
        wrapper.eq("accountname",accName);
        wrapper.eq( "accountpwd", password);
        wrapper.eq("delflag",0);
        //调用dao查一个
        return accountDao.selectOne(wrapper);
    }
}
