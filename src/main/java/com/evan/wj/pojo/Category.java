package com.evan.wj.pojo;

//@Entity
//@Table(name = "category")
//@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })

public class Category {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    int id;

    String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}