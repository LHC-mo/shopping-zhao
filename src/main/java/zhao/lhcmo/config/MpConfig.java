package zhao.lhcmo.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MpConfig {
    @Bean
    public MybatisPlusInterceptor interceptor() {

        var mPInterceptor = new MybatisPlusInterceptor();
        //页拦截器 用于处理分页
        mPInterceptor.addInnerInterceptor( new PaginationInnerInterceptor());
        return mPInterceptor;
    }
}
