package one.app.mappers;

import javax.annotation.processing.Generated;
import one.app.users.UserModel;
import one.app.users.UserModel.UserModelBuilder;
import one.app.users.UserRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-05T07:52:29+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.22 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel fromRequest(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        UserModelBuilder userModel = UserModel.builder();

        userModel.firstName( userRequest.getFirstName() );

        return userModel.build();
    }
}
