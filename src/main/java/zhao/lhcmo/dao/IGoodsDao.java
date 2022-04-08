package zhao.lhcmo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import zhao.lhcmo.pojo.Goods;

//商品静态层
@Mapper
public interface IGoodsDao extends BaseMapper<Goods> {
}
