


## demo02 - Member classes
* static member class 
  (no-acc-mod) 
  (outer class : outerfield1(st) , outerfield2 , field(st) ) 
  (inner class : innerfield1(st) , innerfield2 , field(st) ) 
  // local class -- declared inside method
  // local class in static method -- behaves like static member class
  // object can be created without object of outer class.
  // can access static members of outer class directly or with ClassName. 
  

## demo03 - Member classes(Outer.Inner inObj = outObj.new Inner()) 
* non-static member class
  (outer class : outerfield1(st) , outerfield2 , field ) 
  (Inner class : final-innerfield(st) , innerfield2 , field() ) (Outer.this.field)
// local class in non-static method -- behaves like non-static member class
// object can be created only with object of outer class.
// can access static members of outer class directly or with ClassName.
// can access non-static members of outer class directly (this) or "Outer.this".
//Outer outerObj = new Outer(); 


## demo04 - Member classes
* local class
* Note: Properties of anonymous inner class are similar to local class.

##FileNIO
Path path = Paths.get(srcPath);
use Files helper  class 
/*
 * Input a path from user.
 * If invalid path, give error.
 * If path is of directory, list contents.
 * If path is of file, display information.
 * */
// Using Files helper class



