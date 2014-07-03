package com.springapp.service

import com.springapp.domain.Person
import org.hibernate.Session
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by Mohsan on 03-07-2014.
 */
@Service
@Transactional
class PersonService {

    @Autowired
    private SessionFactory sessionFactory


    public void save(Person entity){
        getCurrentSession().save(entity)
    }

    public void delete(Person entity){
        getCurrentSession().delete(entity)
    }

    public void update(Person entity){
        getCurrentSession().update(entity)
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

}
