class Factory{
AbstractObject createObject(String type){
  AbstractObject O=new ObjectGeneric();
  if (type=="A"){
    O= new ObjectA();
  }else if (type=="B"){
    O= new ObjectB();
  }
  return O;
}
}