public class OrderedArrayList <T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public void add(int index, T element){
    add(element);
  }
  public boolean add(T element){
    for(int i = 0; i < size(); i++){
      if(element.compareTo(get(i)) < 0){
        super.add(i, element);
        return true;
      }
    }
    super.add(element);
    return true;
  }
}
