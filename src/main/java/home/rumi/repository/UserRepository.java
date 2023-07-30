package home.rumi.repository;

import home.rumi.controller.DTO.request.UserSaveRequest;
import home.rumi.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private static Map<Long, User> userMap = new HashMap<Long, User>();
    private AtomicLong atomicId = new AtomicLong();

    public void save(UserSaveRequest req) {
        Long id = atomicId.getAndUpdate(n -> n+=1);
        User user = new User(id, req.getName());
        userMap.put(id, user);
    }

    public List<User> getUsers() {
        return userMap.values().stream().toList();
    }
}
