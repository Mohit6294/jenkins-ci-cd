package in.ineuron.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jenkins")
public class CICDDemoController {

    @GetMapping("/{name}")
    public String welcomeToJenkins(@PathVariable("name") String name){
        return "Welcome "+name +"to Jenkins Tutorial";
    }
}
