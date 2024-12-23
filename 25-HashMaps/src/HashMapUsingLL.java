import java.util.ArrayList;
import java.util.LinkedList;

//Custom HashMap using Linked List
public class HashMapUsingLL<K, V> {
    ArrayList<LinkedList<Entity>> list;

    private int size = 0;

    private float loadFactor = 0.5f;

    public HashMapUsingLL() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        //If Existing key found
        for (Entity entity: entities) {
            if(entity.key.equals(key)) {
                entity.value = (String) value;
                return;
            }
        }

        if((float)size / list.size() > loadFactor) {
            reHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("Doubling the size of the table i.e. ReHashing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entities : old) {
            for(Entity entity: entities) {
                put((K) entity.key, (V) entity.value);
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity: entities) {
            if(entity.key.equals(key)) {
                return (V) entity.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for (Entity entity: entities) {
            if(entity.key.equals(key)) {
                target = entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (LinkedList<Entity> entities: list) {
            for (Entity entity: entities) {
                sb.append(entity.key);
                sb.append("=");
                sb.append(entity.value);
                sb.append(",");
            }
        }
        sb.append("}");

        return sb.toString();
    }

    //Analyzing Distribution
    public void analyzeDistribution() {
        for (int i = 0; i < list.size(); i++) {
            LinkedList<Entity> entities = list.get(i);
            System.out.println("Slot " + i + ": " + entities.size() + " entities");
        }
    }


    private static class Entity<K, V> {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
