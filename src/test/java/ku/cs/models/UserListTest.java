package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Mek", "111");
        userList.addUser("Stamp", "222");
        userList.addUser("Jay", "333");

        // TODO: find one of them
        User actual = userList.findUserByUsername("Mek");

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
        assertEquals("Mek", actual.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Mek", "111");
        userList.addUser("Stamp", "222");
        userList.addUser("Jay", "333");
        // TODO: change password of one user
        boolean actual = userList.changePassword("Mek", "111", "theflash");

        // TODO: assert that user can change password
        // assertTrue(actual);
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Mek", "111");
        userList.addUser("Stamp", "222");
        userList.addUser("Jay", "333");
        // TODO: call login() with correct username and password
        User actual = userList.login("Mek", "111");
        // TODO: assert that User object is found
        // assertEquals(expected, actual);
        assertEquals(userList.findUserByUsername("Mek"), actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Mek", "111");
        userList.addUser("Stamp", "222");
        userList.addUser("Jay", "333");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("Mek", "kaomungai");
        // TODO: assert that the method return null
        // assertNull(actual);
        assertNull(actual);
    }

}