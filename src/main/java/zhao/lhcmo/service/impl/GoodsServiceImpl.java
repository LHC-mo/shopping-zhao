package zhao.lhcmo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import zhao.lhcmo.dao.IGoodsDao;
import zhao.lhcmo.pojo.Goods;
import zhao.lhcmo.service.IGoodsService;
@Service
public class GoodsServiceImpl extends ServiceImpl<IGoodsDao, Goods> implements IGoodsService {
}
