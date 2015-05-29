/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.sit.model;

import java.util.List;

/**
 *
 * @author notepad
 */
public abstract class AbstractDAO<T> {

    public abstract List<T> read();

    public abstract boolean delete(T entity);

    public abstract boolean create(T entity);

    public abstract boolean update(T entity);
}
