package zhao.lhcmo.pojo;

import lombok.Data;

@Data
public class OrderItem {
    private Integer orderId;
    private Integer accountId;
    private Integer goodsId;
    private Double goodsPrice;
    private Integer goodsNum;
}
