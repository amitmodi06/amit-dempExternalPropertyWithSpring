package amit.springframework.amitdempExternalPropertyWithSpring.config;

import amit.springframework.amitdempExternalPropertyWithSpring.examplebeans.FakeDataSource;
import amit.springframework.amitdempExternalPropertyWithSpring.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * created by KUAM on 4/24/2020
 */
@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${amit.username}")
    private String user;

    @Value("${amit.password}")
    private String password;

    @Value("${amit.dburl}")
    private String url;

    @Value("${amit.jms.username}")
    private String jmsUserName;

    @Value("${amit.jms.password}")
    private String jmspassword;

    @Value("${amit.jms.url}")
    private String jmsurl;

    @Bean
    public FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUser(jmsUserName);
        fakeJMSBroker.setPass(jmspassword);
        fakeJMSBroker.setDburl(jmsurl);
        return fakeJMSBroker;
    }

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setNameUser(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrldb(url);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
