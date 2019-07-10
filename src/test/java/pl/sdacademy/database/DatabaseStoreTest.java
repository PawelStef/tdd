package pl.sdacademy.database;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseStoreTest {

    private static DatabaseConnection databaseConnection;
    private DatabaseStore databaseStore;

    @BeforeAll
    static void steUpTestCase(){
        databaseConnection = new DatabaseConnection();
        databaseConnection.open();
    }

    @AfterAll
    static void tearDownTestCase(){
        databaseConnection.close();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Starting next test");
        databaseStore = new DatabaseStore(databaseConnection);
    }
    @AfterEach
    void tearDown(){
        databaseStore.clean();
    }

    @Test
    void shouldAdSingleData(){
        final String valueToInsert = "Heloł";

        databaseStore.addData(valueToInsert);

        final List<String> actualValue= databaseStore.getData();
        assertTrue(actualValue.contains(valueToInsert));
    }

    @Test
    void shouldAdMultipleData(){
        final String valueToInsertA = "HelołA";
        final String valueToInsertB = "HelołB";
        final String valueToInsertC = "HelołC";

        databaseStore.addData(valueToInsertA,valueToInsertB,valueToInsertC);
        final List<String> actualValue= databaseStore.getData();
        assertIterableEquals(Arrays.asList(valueToInsertA,valueToInsertB,valueToInsertC),actualValue);

    }

    @Test
    void shouldRemoveMultipleData(){
        final String valueToInsertA = "HelołA";
        final String valueToInsertB = "HelołB";
        final String valueToInsertC = "HelołC";

        databaseStore.addData(valueToInsertA,valueToInsertB,valueToInsertC);
        databaseStore.removeData(valueToInsertA,valueToInsertB);
        final List<String> actualValue= databaseStore.getData();
        assertIterableEquals(Collections.singletonList(valueToInsertC),actualValue);

    }

    //test dla clean

}