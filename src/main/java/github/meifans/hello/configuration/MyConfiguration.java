package github.meifans.hello.configuration;

<<<<<<< HEAD
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
=======
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
>>>>>>> 4e2b3ecdcaf74b4dd1bcc7916f861a7f184f84fa
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
<<<<<<< HEAD
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
=======
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.filter.DelegatingFilterProxy;
>>>>>>> 4e2b3ecdcaf74b4dd1bcc7916f861a7f184f84fa

/**
 * @author meifans
 *
 */
@Configuration
<<<<<<< HEAD
public class MyConfiguration {
=======
public class MyConfiguration implements WebApplicationInitializer {
>>>>>>> 4e2b3ecdcaf74b4dd1bcc7916f861a7f184f84fa

    /**
     * spring Mvc 使用HttpMessagerConverters接口转换Htpp和响应
     * 合理的默认实现已经被包含在里面，比如对象可以自动转换成JSON和XML格式，字符串默认使用utf-8等等。
     * 如果你想添加自己的自定义转换，可以使用HttpMessageConverters 任何在上下文中的HttpMessageConverter
     * bean 都会被加到转换器列表（HttpMessageConverters的一个list）， 也可以通过这种方式覆盖默认的转换器。
     * 
     * @return
     */
<<<<<<< HEAD
    @Bean
=======
    // @Bean
>>>>>>> 4e2b3ecdcaf74b4dd1bcc7916f861a7f184f84fa
    public HttpMessageConverters customConverers() {
        HttpMessageConverter<?> additional = new StringHttpMessageConverter();
        HttpMessageConverter<?> another = new MappingJackson2HttpMessageConverter();
        return new HttpMessageConverters(additional, another);
    }

    /**
     * Spring MVC 使用ConfigurableWebBindingInitializer 来初始化一个
     * WebDataBinder,来绑定请求. 如果你创建ConfigurableWebBindingInitializer @bean,spring
     * boot 会自动配置Spring MVC使用它。
     * 
     * @return
     */
<<<<<<< HEAD
    @Bean
=======
    // @Bean
>>>>>>> 4e2b3ecdcaf74b4dd1bcc7916f861a7f184f84fa
    public ConfigurableWebBindingInitializer customDateBinder() {
        @SuppressWarnings("unused")
        WebDataBinder binder;
        return null;

    }

<<<<<<< HEAD
=======
    /**
     * Configure the given {@link ServletContext} with any servlets, filters,
     * listeners context-params and attributes
     * 
     * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
     */
    @Override
    public void onStartup(ServletContext container) throws ServletException {
        // the special Filter delegate other Filter do it's homework in spring
        // security
        container.addFilter("myfilter", new DelegatingFilterProxy());

    }

>>>>>>> 4e2b3ecdcaf74b4dd1bcc7916f861a7f184f84fa
}
