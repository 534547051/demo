package config;

import component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc 不要接管SpringMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer{

    @Bean//将组件注册在容器中
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
