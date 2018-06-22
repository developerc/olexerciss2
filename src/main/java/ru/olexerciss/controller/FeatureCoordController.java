package ru.olexerciss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.olexerciss.entity.FeatureCoord;
import ru.olexerciss.service.FeatureCoordService;

import java.util.List;

@Controller
@RequestMapping("/featurecoord")
public class FeatureCoordController {
    @Autowired
    private FeatureCoordService featureCoordService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureCoord addFeatureCoord(@RequestBody FeatureCoord featureCoord){
        return featureCoordService.addFeatureCoord(featureCoord);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<FeatureCoord> getAllFeatureCoord(){
        return featureCoordService.getAllFeatureCoords();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureCoord getFeatureCoordById(@PathVariable(value = "id") String id){
        // exception
        return featureCoordService.getFeatureCoordById(Long.parseLong(id));
    }

    // localhost:8080/cat/delete?id=5&name=Jack
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureCoord deleteFeatureCoord(@RequestParam(value = "id") String id) {
        return featureCoordService.deleteFeatureCoord(Long.parseLong(id));
    }

    @RequestMapping(value = "/upd", method = RequestMethod.PUT, produces = "application/json;charset=utf-8")
    @ResponseBody
    public FeatureCoord updFeatureCoord(@RequestBody FeatureCoord featureCoord){
        return featureCoordService.updFeatureCoord(featureCoord);
    }
}
