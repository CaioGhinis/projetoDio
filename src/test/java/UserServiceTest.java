import org.example.model.User;
import org.example.service.UserService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    public void testGetUserById() {
        // Arrange
        UserService userService = new UserService();

        // Act
        User user = userService.getUserById(1);

        // Assert
        assertEquals("Caio", user.getName(), "O nome do usuário deve ser 'Caio'");
        assertEquals(25, user.getAge(), "A idade do usuário deve ser 25");
    }
}
