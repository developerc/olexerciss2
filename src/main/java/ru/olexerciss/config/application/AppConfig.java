package ru.olexerciss.config.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.olexerciss.dao.FeatureCoordDao;
import ru.olexerciss.dao.FeatureLonLatDao;
import ru.olexerciss.dao.FeatureThreadDao;
import ru.olexerciss.dao.impl.FeatureCoordDaoImpl;
import ru.olexerciss.dao.impl.FeatureLonLatDaoImpl;
import ru.olexerciss.dao.impl.FeatureThreadDaoImpl;
import ru.olexerciss.entity.FeatureCoord;
import ru.olexerciss.entity.FeatureLonLat;
import ru.olexerciss.entity.FeatureThread;

@Configuration
@PropertySource(value = "classpath:util.properties")
@PropertySource(value = "classpath:auth.properties")
public class AppConfig {
    @Autowired
    private Environment environment;

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.mariadb.driver"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.mariadb.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.mariadb.user"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.mariadb.password"));
        return dataSource;
    }

    @Bean
    public FeatureLonLatDao featureLonLatDao(){
        return new FeatureLonLatDaoImpl(FeatureLonLat.class);
    }

    @Bean
    public FeatureCoordDao featureCoordDao(){
        return new FeatureCoordDaoImpl(FeatureCoord.class);
    }

    @Bean
    public FeatureThreadDao featureThreadDao(){
        return new FeatureThreadDaoImpl(FeatureThread.class);
    }
}
