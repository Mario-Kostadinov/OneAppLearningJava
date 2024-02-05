package one.app.users;

import one.app.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private ArrayList<UserModel> users = new ArrayList<>(this.seedDB());
    private final UserMapper mapper;
//
    @Autowired
    public UserService(UserMapper mapper) {
       this.mapper = mapper;
    }

    private List<UserModel> seedDB() {
        UserModel userOne = UserModel.builder().firstName("Ivan").role("user").build();
        UserModel userTwo = new UserModel("Dragoi", null, 1);
        return List.of(userOne, userTwo);
    }

    public List<UserModel> getUsers() {
        return this.users;
    }

    public UserModel createUser(UserRequest userRequest) {
        UserModel newUser = mapper.fromRequest(userRequest);
        this.users.add(newUser);

        return newUser;
    }

}
