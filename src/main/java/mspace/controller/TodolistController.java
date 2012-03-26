package mspace.controller;

import mspace.domain.db.ITodoRepo;
import mspace.domain.db.TodoRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TodolistController {
    private List<String> tasks;
    private ITodoRepo todoRepo;

    public TodolistController(ITodoRepo todoRepo) {
        this.todoRepo = todoRepo;
        tasks = new ArrayList<String>();
    }

    public TodolistController() {
        todoRepo = new TodoRepo();
        tasks = new ArrayList<String>();
    }

    @RequestMapping("/todolist.html")
    public ModelAndView List() {
        ModelAndView taskList = new ModelAndView("todolist");
        taskList.addObject("message", "Tasks");
        taskList.addObject("container", tasks);
        return taskList;
    }

    @RequestMapping(value = "/todolist.html", method = RequestMethod.POST)
    public ModelAndView Create(@RequestParam("task") String taskItem) {
        ModelAndView task = new ModelAndView("todolist") ;
        task.addObject("taskItem", taskItem);
        tasks.add(taskItem);
        return List();
    }

    public void save() {
        //To change body of created methods use File | Settings | File Templates.
    }
}
