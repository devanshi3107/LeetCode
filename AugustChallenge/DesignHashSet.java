/*****************************************
MyHashSet hashSet = new MyHashSet();
hashSet.add(1);         
hashSet.add(2);         
hashSet.contains(1);    // returns true
hashSet.contains(3);    // returns false (not found)
hashSet.add(2);          
hashSet.contains(2);    // returns true
hashSet.remove(2);          
hashSet.contains(2);    // returns false (already removed)
*****************************************************/

class MyHashSet {

    /** Initialize your data structure here. */
    boolean table[];
    public MyHashSet() {
        this.table = new boolean[1000001];
    }
    
    public void add(int key) {
        this.table[key]=true;
        
    }
    
    public void remove(int key) {
        this.table[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return this.table[key];
        
    }
}
