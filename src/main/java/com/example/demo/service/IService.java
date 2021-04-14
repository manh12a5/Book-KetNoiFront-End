package com.example.demo.service;

import java.util.List;

public interface IService<E>{

    List<E> findAll();

    E findById(Long id);

    E save(E b);

    void delete(Long id);

}
