package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public abstract class People<T extends Person> implements Iterable<T>{
    private List<T> personList = new ArrayList();

    public void add(T p){
        personList.add(p);
    }

    public T findById(Long id){
        for (T person : personList) {
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(T target){
        for (T person : personList) {
            if(person.equals(target)){
                return true;
            }
        }
        return false;
    }

    public void remove(T target){
        personList.remove(target);
    }

    public void remove(Long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Stream<T> stream(){
        return personList.stream();
    }

    public T[] asArray(){
        T[] arr = (T[]) Array.newInstance(personList.get(0).getClass(), personList.size());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = personList.get(i);
        }
        return arr;
    }

    @Override
    public Iterator<T> iterator() {
        return personList.iterator();
    }

}
