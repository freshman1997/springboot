package com.yuan.cn.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {
//    @Autowired
//    private SqlSessionFactory sqlSessionFactory;
//    @PostConstruct
//    public void init()
//    {
//        Interceptor interceptor = new MyPlugin();
//        sqlSessionFactory.getConfiguration().addInterceptor(interceptor);
//    }
    @Bean
    public MapperScannerConfigurer scannerConfigurer()
    {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.yuan.cn.mappers");
        mapperScannerConfigurer.setAnnotationClass(Mapper.class);
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }
}
