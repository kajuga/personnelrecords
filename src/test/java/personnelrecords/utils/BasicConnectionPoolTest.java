package personnelrecords.utils;

import org.junit.Test;
import personnelrecords.util.BasicConnectionPool;
import personnelrecords.util.ConnectionPool;

import java.sql.SQLException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasicConnectionPoolTest {

    @Test
    public void whenCalledgetConnection_thenCorrect() throws SQLException {
        ConnectionPool connectionPool = BasicConnectionPool.create();
        assertTrue(connectionPool.getConnection().isValid(1));
        assertFalse(connectionPool.getConnection().isClosed());
    }
}
