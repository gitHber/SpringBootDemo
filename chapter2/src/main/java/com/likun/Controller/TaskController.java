package com.likun.Controller;

import com.likun.dao.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
//    @Autowired
//    DBConnector connector;
    @RequestMapping(value={"/", ""})
    public String hellTask() {
//      connector.configure();
        return "hello task";
    }
}
