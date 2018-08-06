package com.ltp.springmvc.control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RestfulTestController {

    @RequestMapping(value = {"/hello"}, method = RequestMethod.POST)
    public String hello(
            @RequestParam(value = "person")
                    String personName) {
            return "Welcome " + personName;
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/person/{id}")
    public String getPersonById(@PathVariable String id) {
        return "Response from GET with id " + id + " " + HttpStatus.OK;
    }






}
