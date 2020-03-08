package AddressBook

import org.junit.Assert
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class AddressBookTest extends GroovyTestCase {

    AddressBook address = new AddressBook()
    Person armand = new Person()



    void testGetPersons() {
    }

    @Test
    void testAdd() {
        address.add(armand)
        armand.firstName = "Armand"
        armand.getFirstName()

        assertEquals("Armand", armand.getFirstName(0))
    }

    void testSet() {
    }

    void testRemove() {
    }

    void testGet() {
    }

    void testClear() {
    }

    void testGetRowCount() {
    }

    void testGetColumnCount() {
    }

    void testGetValueAt() {
    }

    void testGetColumnName() {
    }
}
