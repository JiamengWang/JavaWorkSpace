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

  int DEFAULT_CAPACITY = 16;
  int DEFAULT_LOAD_FACTOR = 0.75;
  Node[] array;
  private int size;
  private float loadfactor;



  public HashTable() {
    this(DEFAULT_CAPACITY,DEFAULT_LOAD_FACTOR);
  }

  public HashTable(int cap) {
    this(cap,DEFAULT_LOAD_FACTOR);
  }

  public HashTable(int cap, int load) {
    array = new Node[cap];
    size = 0;
    loadfactor = load;
  }

  public int size() {
    return this.size;
  }

  





}
