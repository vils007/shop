package ru.myshop.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Администратор on 19.06.2017.
 */
@Entity
public class Thing {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int price; // v kopeikah

    @OneToMany
    private List<ThingInOrder> thingInOrderList;

    public List<ThingInOrder> getThingInOrderList() {
        return thingInOrderList;
    }

    public void setThingInOrderList(List<ThingInOrder> thingInOrderList) {
        this.thingInOrderList = thingInOrderList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
