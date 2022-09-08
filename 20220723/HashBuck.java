public class HashBuck {

static class Node {
public int key;
public int val;
public Node next;

public Node(int key, int val) {
this.key = key;
this.val = val;
}
}

public Node[] array ;
public int usedSize;//记录 当前哈希桶当中 有效数据的个数

public HashBuck() {
this.array = new Node[10];
this.usedSize = 0;
}

/**
* 存储key val
* @param key
* @param val
* @return
*/
public int put(int key,int val) {

}

/**
* 通过key值 获取val 值
* @param key
* @return
*/
public int get(int key) {

}
}
