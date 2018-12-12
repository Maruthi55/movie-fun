package org.superbiz.moviefun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Map;

@Controller
public class HomeController {
    private MoviesBean moviesBean;

    public HomeController(MoviesBean moviesBean) {
        this.moviesBean = moviesBean;
    }

    @GetMapping("/setup")
    public String setup(Map<String, Object> model) {
        model.put("movies", moviesBean.getMovies());
        return "setup";
    }

    @GetMapping("/")
    public String setup() {
        return "index";
    }
}
