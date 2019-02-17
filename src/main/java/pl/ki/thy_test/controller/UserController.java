package pl.ki.thy_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.ki.thy_test.model.User;
import pl.ki.thy_test.service.UserService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("app")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("create-user")
    public ModelAndView createUserView() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user-creation");
        mav.addObject("user", new User());
        mav.addObject("allProfiles", getProfiles());
        return mav;
    }

    @PostMapping("create-user")
    public ModelAndView createUser(@Valid User user, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if(result.hasErrors()) {
            mav.setViewName("user-creation");
            mav.addObject("user", user);
            mav.addObject("allProfiles", getProfiles());
            return mav;
        }
        userService.addUser(user);
        mav.addObject("allUsers", userService.getAllUserArticles());
        mav.setViewName("user-info");
        return mav;
    }
    private List<String> getProfiles() {
        List<String> list = new ArrayList<>();
        list.add("Developer");
        list.add("Manager");
        list.add("Director");
        return list;
    }
}