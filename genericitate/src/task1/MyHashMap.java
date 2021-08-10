package task1;

import java.util.Arrays;

public class MyHashMap<K, V> {

    int size;
    public Entry<K, V>[] table;

    public MyHashMap(int size) {
        this.size = size;
        this.table = new Entry[size];
    }

    class Entry<K,V>  {
        private K key;
        private V value;
        Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    public void put (K key, V value) {
        int pos = key.hashCode();
        Entry<K, V> en = table[pos];

        if (en != null) {
            // if duplicate, update value
            if (en.key.equals(key)) {
                en.value = value;
            } else {
                // if not duplicate, add to end
                while (en.next != null) {
                    en = en.next;
                }
                Entry newEn = new Entry(key, value);
                en.next = newEn;
            }
        } else {
            Entry<K, V> newEntry = new Entry(key, value);
            table[pos] = newEntry;
        }
    }

    public Entry get(K key) {
        int pos = key.hashCode();
        Entry<K, V> enIter = table[pos];

        while (enIter != null) {
            if (enIter.key.equals(key)) {
                return enIter;
            }
            enIter = enIter.next;
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyHashMap{" +
                Arrays.toString(table) +
                '}';
    }
}
