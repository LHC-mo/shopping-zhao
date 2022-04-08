package zhao.lhcmo.pojo;

import lombok.Data;

import java.sql.Date;
@Data
public class Order {
    private Integer orderId;
    private Integer accountId;
    private Date createDate;
}
