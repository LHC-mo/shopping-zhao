package zhao.lhcmo.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Type {
    @TableId("typeid")
    private Integer typeId;
    private String typeName;
}
