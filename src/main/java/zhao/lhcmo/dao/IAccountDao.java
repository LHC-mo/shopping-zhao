package zhao.lhcmo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import zhao.lhcmo.pojo.Account;


@Mapper
public interface IAccountDao extends BaseMapper<Account> {
}
