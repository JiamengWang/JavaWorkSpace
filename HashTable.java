public class HashTable{
  public static class Node {
    final String K;
    Integer V;
    Node next;
    public Node (String k, Integer v) {
      this.K = k;
      this.V = v;
    }

    public String getKey() {
      return this.K;
    }

    public Integer getValue() {
      return this.V;
    }

    public void setValue(Integer value) {
      this.V = value;
    }
  }

  final static int DEFAULT_CAPACITY = 16;
  final static float DEFAULT_LOAD_FACTOR = 0.75f;
  Node[] array;
  private int size;
  private float loadfactor;



  public HashTable() {
    this(DEFAULT_CAPACITY,DEFAULT_LOAD_FACTOR);
  }

  public HashTable(int cap) {
    this(cap,DEFAULT_LOAD_FACTOR);
  }

  public HashTable(int cap, float load) {
    array = new Node[cap];
    size = 0;
    loadfactor = load;
  }

  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public Integer put(String s, Integer v) {
    int index = getIndex(s);
    Node temp = array[index];
    if (temp == null) {
      array[index] = new Node(s,v);
      return null;
    }
    Node prev = temp;
    while (temp != null) {
      
    }
    return null;
  }

  public int getIndex(String s) {
    return hash(s) % array.length;
  }

  public int hash(String s) {
    int hash = s.hashCode();
    return hash & 0X7FFFFFFF;
  }





}
