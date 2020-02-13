package com.springframework.enrollement.Controller;

import com.springframework.enrollement.Service.EnrollementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ws.server.endpoint.annotation.XPathParam;

@Controller
public class EnrollementController {

    @Autowired
    private EnrollementService enrollementService;


    @GetMapping("/details")
    public ModelAndView getPersonDetails(@PathVariable("id")long id){
        enrollementService.getbyID(id);
        ModelAndView modelview=new ModelAndView();

        return modelview;
    }
}
