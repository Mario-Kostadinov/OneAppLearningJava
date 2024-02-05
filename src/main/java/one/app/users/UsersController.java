package one.app.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UsersController implements Users {

    private final UserService userService;
    private final UserDTOMapper userMapper;

    @Autowired
    public UsersController(UserService userService, UserDTOMapper userDTOMapper) {
        this.userService = userService;
        this.userMapper = userDTOMapper;
    }

    @Override
    public List<UserModelDTO> getUsers() {
        return userService.getUsers()
                .stream()
                .map(userMapper)
                .collect(Collectors.toList());
    }

    @Override
    public UserModelDTO getUser(@PathVariable Integer id) {
        return userService.getUsers().stream()
                .filter(userModel -> userModel.getId() == id).findFirst()
                .map(userMapper).orElse(null);
    }

    @Override
    public UserModelDTO createUser(UserRequest userRequest) {
        UserModel user = userService.createUser(userRequest);
        return userMapper.apply(user);
    }
}