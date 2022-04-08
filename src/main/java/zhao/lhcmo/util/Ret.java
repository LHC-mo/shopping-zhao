package zhao.lhcmo.util;

import lombok.Data;

//此类用于返回前端数据统一
@Data
public class Ret {
    private Boolean flag;
    private Object data;
    private String msg;

    public Ret(Object object,boolean flag) {
        this.flag = flag;
        this.data = object;
    }

    public Ret() {
    }

    public Ret(Object data) {
        this.flag=true;
        this.data = data;
    }

    public Ret(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
