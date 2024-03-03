package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1L, "Katy", "0978567325"));
        list.add(new Contact(2L, "Mary", "0663258044"));
        list.add(new Contact(3L, "David", "0985666321"));
        list.add(new Contact(4L, "Max", "0985223549"));
        return list;
    }
}
