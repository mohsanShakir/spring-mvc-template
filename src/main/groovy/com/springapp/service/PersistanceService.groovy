package com.springapp.service

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import javax.persistence.criteria.CriteriaBuilder

/**
 * Created with IntelliJ IDEA.
 * User: Mohsan
 * Date: 26-03-14
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
class PersistanceService {

    @Autowired
    private SessionFactory sessionFactory

    public void save(Object entity){
        getCurrentSession().save(entity)
    }

    public void delete(Object entity){
        getCurrentSession().delete(entity)
    }

    public void update(Object entity){
        getCurrentSession().update(entity)
    }

    public Object findById(Class clazz, Long entityId){
        return getCurrentSession().get(clazz,entityId)
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }







}
