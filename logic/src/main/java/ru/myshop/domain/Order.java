package ru.myshop.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Администратор on 19.06.2017.
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<ThingInOrder> thingInOrderList;
    // like many to many but new class

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ThingInOrder> getThingInOrderList() {
        return thingInOrderList;
    }

    public void setThingInOrderList(List<ThingInOrder> thingInOrderList) {
        this.thingInOrderList = thingInOrderList;
    }


}
