package com.example.smu.Index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/truck-crane-min")
    public String truckCraneMin(){
        return "auto/truck-crane-min";
    }

    @GetMapping("/truck-crane")
    public String truckCrane(){
        return "auto/truck-crane";
    }

    @GetMapping("/bobcat")
    public String bobcat(){
        return "auto/bobcat";
    }

    @GetMapping("/autotower")
    public String autotower(){
        return "auto/autotower";
    }

    @GetMapping("/grader")
    public String grader(){
        return "auto/grader";
    }

    @GetMapping("/manipulator")
    public String manipulator(){
        return "auto/manipulator";
    }

    @GetMapping("/dump-truck")
    public String dumpTrack(){
        return "auto/drump-track";
    }

    @GetMapping("/tral")
    public String tral(){
        return "auto/tral";
    }

    @GetMapping("/front-loader")
    public String frontLoader(){
        return "auto/front-loader";
    }

    @GetMapping("/barge")
    public String barge(){
        return "auto/barge";
    }

    @GetMapping("/excavator")
    public String excavator(){
        return "auto/excavator";
    }

    @GetMapping("/backhoe-loader")
    public String backhoeLoader(){
        return "auto/backhoe-loader";
    }
    @GetMapping("/mixer")
    public String mixer(){
        return "auto/mixer";
    }
    @GetMapping("/concrete-pump")
    public String concretePump(){
        return "auto/concrete_pump";
    }
}
