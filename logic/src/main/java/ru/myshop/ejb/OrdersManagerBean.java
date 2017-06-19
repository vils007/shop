package ru.myshop.ejb;

import ru.myshop.domain.Order;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Администратор on 19.06.2017.
 */

@Stateless
@LocalBean
public class OrdersManagerBean {

@PersistenceContext(name = "entityManager")
private EntityManager entityManager;

public Order createOrder(){

}
}
