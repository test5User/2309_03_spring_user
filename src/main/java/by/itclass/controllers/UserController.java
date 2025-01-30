package by.itclass.controllers;

import by.itclass.model.entities.User;
import by.itclass.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static by.itclass.constants.Constants.*;

@Controller
public class UserController {
    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String root() {
        return INDEX_PAGE;
    }

    @GetMapping(ALL_USERS_URL)
    public String all(Model model) {
        var users = service.getAllUsers();
        model.addAttribute(USER_LIST_ATTR, users);
        return USERS_PAGE;
    }

    @GetMapping(DELETE_USER_URL)
    public String del(@RequestParam(name = "id") int id) {
        service.delete(id);
        return "redirect:/all";
    }

    @GetMapping(ADD_USER_URL)
    public ModelAndView add() {
        return new ModelAndView(ADD_PAGE, USER_ATTR, new User());
    }

    @PostMapping(SAVE_USER_URL)
    public String save(@ModelAttribute(name = USER_ATTR) User user) {
        service.add(user);
        return "redirect:" + ALL_USERS_URL;
    }

    @PostMapping("/add-old")
    public String addAll(@RequestParam(name="name") String name,
                         @RequestParam(name="age") int age) {
        service.add(new User(name, age));
        return "redirect:" + ALL_USERS_URL;
    }

    @GetMapping(UPD_USER_URL)
    public ModelAndView upd(@RequestParam(name="id") int id,
                            @RequestParam(name="name") String name,
                            @RequestParam(name="age") int age) {
        return new ModelAndView(UPD_PAGE, USER_ATTR, new User(id, name, age));
    }

    @PostMapping(SAVE_UPD_USER_URL)
    public String saveUpd(@ModelAttribute(name = USER_ATTR) User user) {
        service.update(user);
        return "redirect:" + ALL_USERS_URL;
    }

    @PostMapping(UPD_USER_URL_OLD)
    public String updOld(@RequestParam(name="id") int id,
                         @RequestParam(name="name") String name,
                         @RequestParam(name="age") int age) {
        service.update(new User(id, name, age));
        return "redirect:" + ALL_USERS_URL;
    }
}
