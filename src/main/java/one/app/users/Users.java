package one.app.users;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public interface Users {
    @GetMapping
    List<UserModelDTO> getUsers();

    @GetMapping("/{id}")
    UserModelDTO getUser(Integer id);

    @PostMapping
    UserModelDTO createUser(@RequestBody UserRequest userRequest);
}

