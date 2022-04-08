package zhao.lhcmo.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public Ret doException(Exception ex) {
        ex.printStackTrace();
        return new Ret(false,"服务器出错");
    }
}
