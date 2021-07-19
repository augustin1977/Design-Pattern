public class ObjectGeneric extends AbstractObject{
  String type;
  ObjectGeneric(){
    this.Object();
  }
  void Object(){   
    this.type="Generic";
  }
   String getType(){
    return this.type;
  }
}