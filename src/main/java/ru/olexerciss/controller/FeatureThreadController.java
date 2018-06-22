package ru.olexerciss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.olexerciss.entity.FeatureThread;
import ru.olexerciss.service.FeatureThreadService;

import java.util.List;

@Controller
@RequestMapping("/featurethread")
public class FeatureThreadController {
    @Autowired
    private FeatureThreadService featureThreadService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureThread addFeatureThread(@RequestBody FeatureThread featureThread){
        return featureThreadService.addFeatureThread(featureThread);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<FeatureThread> getDamageDescriptions(){
        return featureThreadService.getAllFeatureThreads();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureThread getFeatureThreadById(@PathVariable(value = "id") String id){
        // exception
        return featureThreadService.getFeatureThreadById(Long.parseLong(id));
    }

    // localhost:8080/cat/delete?id=5&name=Jack
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureThread deleteFeatureThread(@RequestParam(value = "id") String id) {
        return featureThreadService.deleteFeatureThread(Long.parseLong(id));
    }

    @RequestMapping(value = "/upd", method = RequestMethod.PUT, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureThread updFeatureThread(@RequestBody FeatureThread featureThread){
        return featureThreadService.updFeatureThread(featureThread);
    }
}
