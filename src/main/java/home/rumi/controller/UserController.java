package home.rumi.controller;

import home.rumi.controller.DTO.request.UserSaveRequest;
import home.rumi.repository.entity.User;
import home.rumi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public String save(@RequestBody UserSaveRequest req, Model model) {
        req.validate();
        service.save(req);
        return "save";
    }

    @GetMapping
    public String getUsers(Model model) {
        List<User> users = service.getUsers();

        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/form")
    public String getSaveFrom() {
        return "user-save-form";
    }
}
