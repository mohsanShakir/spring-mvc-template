package com.springapp.controller

import com.springapp.domain.Person
import com.springapp.service.PersistanceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created with IntelliJ IDEA.
 * User: Mohsan
 * Date: 09-03-14
 * Time: 01:19
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PersonController {

    @Autowired
    private PersistanceService persistanceService


    @RequestMapping('/greeting')
    public String greeting(Model model) {

        Person p = new Person(name: "Tom")
        persistanceService.save(p)

        model.name = p.name
        return '/greeting'
    }

    @RequestMapping('/bla')
    public String bla(Model model) {

        Person p = (Person)persistanceService.findById(Person.class,Long.parseLong("1"))

        model.name = p?.name
        return '/greeting'
    }
}