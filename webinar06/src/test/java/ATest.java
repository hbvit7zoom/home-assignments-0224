import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.junit.Assert;
import org.junit.Test;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.PostgreSQLContainer;
import ru.sberbank.jd.ConnectionUtils;

import java.sql.Connection;

public class ATest {

    @Test
    public void t() throws LiquibaseException {

        PostgreSQLContainer container = new PostgreSQLContainer<>("postgres:13.9-alpine")
                .withNetwork(Network.newNetwork());
        container.start();

        String jdbcUrl = container.getJdbcUrl();
        String username = container.getUsername();
        String password = container.getPassword();

//        Connection connection = ConnectionUtils.getConnection();
        Connection connection = ConnectionUtils.getConnection(jdbcUrl, username, password);
        System.out.println(connection);

        Database database = DatabaseFactory.getInstance()
                .findCorrectDatabaseImplementation(new JdbcConnection(connection));


//        Liquibase liquibase = new Liquibase("db/changelog.xml", new ClassLoaderResourceAccessor(), database);
        Liquibase liquibase = new Liquibase("db/changelog.sql", new ClassLoaderResourceAccessor(), database);
        liquibase.update();

        Assert.assertTrue(true);

        container.stop();
    }
}
