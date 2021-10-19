package com.yash.SpringJPAems.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.yash"})
@EnableTransactionManagement
@PropertySource("classpath:database.properties")

public class WebMvcConfig implements WebMvcConfigurer {
 
   @Bean
   public InternalResourceViewResolver resolver() {
      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
      resolver.setViewClass(JstlView.class);
      resolver.setPrefix("/WEB-INF/view/");
      resolver.setSuffix(".jsp");
      return resolver;
   }
 
   @Bean
   public MessageSource messageSource() {
      ResourceBundleMessageSource source = new ResourceBundleMessageSource();
      source.setBasename("messages");
      return source;
   }
 
   @Override
   public Validator getValidator() {
      LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
      validator.setValidationMessageSource(messageSource());
      return validator;
   }
   
   @Autowired
   private Environment env;   
   @Bean
   public LocalContainerEntityManagerFactoryBean getEntityManagerFactoryBean() {
       LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
       lcemfb.setJpaVendorAdapter(getJpaVendorAdapter());
       lcemfb.setDataSource(getDataSource());
       lcemfb.setPersistenceUnitName("myJpaPersistenceUnit");
       lcemfb.setPackagesToScan("com.yash");
       lcemfb.setJpaProperties(jpaProperties());
       return lcemfb;
   }
   @Bean
   public JpaVendorAdapter getJpaVendorAdapter() {
       JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
       return adapter;
   }
   @Bean
   public DataSource getDataSource() {
       BasicDataSource dataSource = new BasicDataSource();
       dataSource.setDriverClassName(env.getProperty("database.driverClassName"));
       dataSource.setUrl(env.getProperty("database.url"));
       dataSource.setUsername(env.getProperty("database.username"));
       dataSource.setPassword(env.getProperty("database.password"));
       return dataSource;
   }
   @Bean
   public PlatformTransactionManager txManager(){
       JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(
               getEntityManagerFactoryBean().getObject());
       return jpaTransactionManager;
   }
   private Properties jpaProperties() {
       Properties properties = new Properties();
       properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
       properties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
       properties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
       return properties;       
   }
}