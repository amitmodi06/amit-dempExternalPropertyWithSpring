package amit.springframework.amitdempExternalPropertyWithSpring.controllers;

import amit.springframework.amitdempExternalPropertyWithSpring.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by KUAM on 4/24/2020
 */
@Controller
public class JokeServiceController {

    private final JokeService jokeService;

    public JokeServiceController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/"})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
