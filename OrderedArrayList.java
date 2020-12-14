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
    if (element == null){
      throw new IllegalArgumentException("No nulls allowed");
    }
    for(int i = 0; i < size(); i++){
      if(element.compareTo(get(i)) < 0){
        super.add(i, element);
        return true;
      }
    }
    super.add(element);
    return true;
  }
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("No nulls allowed");
    }
    T indexEle = super.get(index);
    super.remove(index);
    add(element);
    return (indexEle);

  }

}
