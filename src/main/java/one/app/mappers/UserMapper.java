package one.app.mappers;

import one.app.users.UserModel;
import one.app.users.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserModel fromRequest(UserRequest userRequest);

}
