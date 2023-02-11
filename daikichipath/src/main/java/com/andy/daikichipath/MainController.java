package com.andy.daikichipath;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Welcome";
    }

    @RequestMapping("/today")
    public String today() {
        return "Today you will find luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @RequestMapping("/travel/{id}")
    public String travel(@PathVariable("id") String id) {
        return "Congratulations! You will soon travel to" + " " + id;
    }

    @RequestMapping("/lotto/{id}")
    public String lotto(@PathVariable("id") String id) {
        if (Integer.parseInt(id) % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
        }
    }
}
