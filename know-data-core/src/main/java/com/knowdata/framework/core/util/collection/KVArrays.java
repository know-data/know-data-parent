package com.knowdata.framework.core.util.collection;

/**
 * @author johnnyzen
 * @version v1.0
 * @create-time 2022/10/3 16:01
 * @description ...
 */
public class KVArrays<K, V> {
    private K[] keyArray;

    private V[] valueArray;

    public KVArrays() {
    }

    public KVArrays(K[] keyArray, V[] valueArray) {
        this.keyArray = keyArray;
        this.valueArray = valueArray;
    }

    public K[] getKeyArray() {
        return keyArray;
    }

    public void setKeyArray(K[] keyArray) {
        this.keyArray = keyArray;
    }

    public V[] getValueArray() {
        return valueArray;
    }

    public void setValueArray(V[] valueArray) {
        this.valueArray = valueArray;
    }
}
