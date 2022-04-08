package zhao.lhcmo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Account {
    //设置mp主键 默认是"id"
    @TableId("accountid")
    private Integer accountId;
    private String accountName;
    private String accountPwd;
    private Integer role;
}
