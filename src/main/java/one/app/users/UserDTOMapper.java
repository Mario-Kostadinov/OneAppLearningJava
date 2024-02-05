package one.app.users;

import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserDTOMapper implements Function<UserModel, UserModelDTO> {

    @Override
    public UserModelDTO apply(UserModel userModel) {
        return UserModelDTO.builder()
                .firstName(userModel.getFirstName())
                .role(userModel.getRole())
                .build();
    }

}
