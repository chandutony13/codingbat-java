First Method
public int countHi(String str) {
  if(str.length()<2){
    return 0;
  }
  if(str.charAt(0)=='h' && str.charAt(1)=='i'){
    return 1+ countHi(str.substring(1));
  }
  return countHi(str.substring(1));
}

2nd using string methods
public int countHi(String str) {
  if(str.length()<2){
    return 0;
  }
  if(str.substring(0,2).equals("hi")){
    return 1+ countHi(str.substring(1));
  }
  return countHi(str.substring(1));
}
