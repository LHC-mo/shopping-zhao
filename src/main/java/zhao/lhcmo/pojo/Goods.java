package zhao.lhcmo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Goods {
    @TableId("goodsid")
    private Integer goodsid;
    private String goodsname;
    private Double price;

}
