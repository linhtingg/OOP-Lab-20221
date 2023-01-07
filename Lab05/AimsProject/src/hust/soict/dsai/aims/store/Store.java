package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    /**
     * This function adds a media item to the store
     *
     * @param m The media object to be added to the store.
     * @return A boolean value.
     */
    public boolean addMedia(Media m){
        return itemsInStore.add(m);
    }

    /**
     * If store has m, remove and return true, else return false
     *
     * @param m The media object to be removed from the store.
     * @return A boolean value.
     */
    public boolean removeMedia(Media m) {
        if (itemsInStore.contains(m)) {
            itemsInStore.remove(m);
            return true;
        } else {
            return false;
        }
    }

    public void displayStore() {
        for (Media m : itemsInStore) {
            System.out.println(m.toString());
        }
    }
    public Media searchInStore(String title) {
        for (Media m: itemsInStore){
            if(m.isMatch(title)){
                return m;
            }
        }
        return null;
    }
}