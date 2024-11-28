package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    private UserRepository userRepo;

    
    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    
    @GetMapping("/register")
    public String showSignupForm() {
        return "signup_form"; 
    }

    
    @PostMapping("/register")
    public String processRegister(@RequestParam String email,
                                  @RequestParam String firstName,
                                  @RequestParam String lastName,
                                  @RequestParam String password,
                                  Model model) {
        
        User user = new User();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);

        
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(password));

        
        userRepo.save(user);

        
        model.addAttribute("message", "Usuário registrado com sucesso!");
        return "register_success"; 
    }

    
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<User> users = userRepo.findAll(); 
        model.addAttribute("listUsers", users); 

        
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();
        model.addAttribute("currentUser", currentUserName); 

        return "users"; 
    }

    
    @PostMapping("/delete_user/{id}")
    public String deleteUser(@PathVariable Long id, Model model) {
        userRepo.findById(id).ifPresent(userRepo::delete); 

        
        model.addAttribute("listUsers", userRepo.findAll());
        return "users"; 
    }
    @Controller
    public class LoginController {
        @GetMapping("/login")
        public String login() {
            return "login"; 
        }
    }

   
}

