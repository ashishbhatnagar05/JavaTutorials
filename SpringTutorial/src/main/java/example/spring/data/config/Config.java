package example.spring.data.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

/**
 * This class is use to run schema.sql against the h2 database.When we run the
 * tests the Customer table wont be there. So we need a mechanism to create a
 * table.
 * 
 * @author Dungeon_Master
 *
 */
@Configuration
public class Config {
	@Value("${jdbc.driver.classname}")
	private String driverClassName;

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String useraname;

	@Value("${jdbc.password}")
	private String password;

	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(useraname);
		dataSource.setPassword(password);

		Resource initSchema = new ClassPathResource("example/spring/data/schema.sql");
		DatabasePopulator databasePopulator = new ResourceDatabasePopulator(initSchema);
		DatabasePopulatorUtils.execute(databasePopulator, dataSource);

		return dataSource;
	}
}
