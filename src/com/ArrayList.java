package com;

public class ArrayList {

    private Object[] array;

    public ArrayList() {
        this.array = new Object[0];
    }

    public int size(){

        int elements = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                elements++;
            }
        }

        return elements;
    }

    public boolean isEmpty(){
        return ArrayList.this.size() == 0;
    }

    public void add(Object value) {
        Object[] newArray = new Object[array.length + 1];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = value;
        array = newArray;
    }

    public void add(int index, Object value) {
        if(index < 0 || index >= array.length) {
            System.out.println("Invalid index");
        }

        boolean isCurrentIndex = false;
        boolean foundIndex = false;
        Object[] newArray = new Object[array.length + 1];

        for(int i = 0; i < array.length; i++){
            if(i == index) {
                isCurrentIndex = true;
            }

            if (isCurrentIndex == false){
                newArray[i] = array[i];
            }
            if(isCurrentIndex == true){
                newArray[index] = value;
                foundIndex = true;
            }
            if(foundIndex == true){
                newArray[i+1] = array[i];
            }
        }
        array = newArray;
    }

    public Object get (int index) {
        return array[index];
    }

    public Object remove (Object value) {
        boolean isRemovedIndex = false;

        Object removedItem = null;

        Object[] newArray = new Object[array.length - 1];

        for(int i = 0; i < array.length - 1; i++){
            if(value.equals(array[i])){
                isRemovedIndex = true;
                removedItem = array[i];
            }

            if(isRemovedIndex == false) {
                newArray[i] = array[i];
            }
            if(isRemovedIndex == true) {
                newArray[i] = array[i + 1];
            }
        }
        if(isRemovedIndex == false){
            return null;
        } else {
            array = newArray;
            return removedItem;
        }
    }

    public Object remove(int index) {
        boolean isRemovedIndex = false;

        Object removedItem = array[index];

        Object[] newArray = new Object[array.length - 1];

        for(int i = 0; i < array.length - 1; i++) {
            if(i == index){
                isRemovedIndex = true;
            }

            if(isRemovedIndex == false) {
                newArray[i] = array[i];
            }
            if(isRemovedIndex == true) {
                newArray[i] = array[i + 1];
            }
        }
        array = newArray;
        return removedItem;
    }

    public void clear(){
        Object[] clearedArray = new Object[0];
        array = clearedArray;
    }
}
