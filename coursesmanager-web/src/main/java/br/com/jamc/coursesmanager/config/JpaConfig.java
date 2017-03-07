package br.com.jamc.coursesmanager.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

/**
 *
 * @author joelamalio
 */
@Configuration
public class JpaConfig {

    @Bean
    public DataSource dataSource() {
        JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
        dsLookup.setResourceRef(true);
        return dsLookup.getDataSource("CoursesManagerDataSource");
    }

}
