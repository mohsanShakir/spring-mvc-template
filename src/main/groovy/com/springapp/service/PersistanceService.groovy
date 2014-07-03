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
@Transactional(readOnly = true)
class PersistanceService {

    @Autowired
    private SessionFactory sessionFactory

    public List<Object> list(Class clazz){
        return getCurrentSession().createCriteria(clazz).list()
    }

    public Object findById(Class clazz, Long entityId){
        return getCurrentSession().get(clazz,entityId)
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }







}
