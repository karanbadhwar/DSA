public class MapUsingHash {

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); //Overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)) {
             entities[hash] = null;
        }
    }

    //As Every Map has Key and Value so created an Object corresponding to that!
//    private class Entity<T, E> {
//        T key;
//        E value;
//
//        public Entity(E value, T key) {
//            this.value = (E) value;
//            this.key = (T) key;
//        }
//    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
