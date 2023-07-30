package home.rumi.service;

import home.rumi.controller.DTO.request.UserSaveRequest;
import home.rumi.repository.UserRepository;
import home.rumi.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;


    public void save(UserSaveRequest req) {
        repository.save(req);
    }

    public List<User> getUsers() {
        return repository.getUsers();
    }
}
