public class MyHashTable<K, V>{
    private class HashNode<K, V>{
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value){
            this.key = key;
            this.value = value;
        }

        public String toString(){
            return "{" + key + " " + value + "}";
        }
    }

    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;

    public MyHashTable(){

    }

    public MyHashTable(int m) {
        M = m;
    }

    private int hash(K key){
        return 0;
    }

    public void put(K key, V value){

    }

    public V get(K key){
        V value = null;
        return value;
    }

    public V remove(K key){
        V value = null;
        return value;
    }

    public boolean contains(V value){
        return false;
    }

    public K getKey(V value){
        K key = null;
        return key;
    }
}
