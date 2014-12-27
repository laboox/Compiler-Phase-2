--LOOP solved
Class X inherits Y {};
Class Y inherits Z {};
Class Z inherits T {};
Class T inherits X {}; 


Class A inherits IO { 
	
	fa1() : Bool {1};
	fa1() : Int {1}; --same method name solved
	
	
	fa2() : Object {1};
	fa3(pa1 : Int) : B {1};
	fa4(pa1 : Int) : A {1};
	
	aa1 : IO;
	aa1 : Int; --same attribute name solved
	
	aa2 : Int;
	aa3 : SELF_TYPE;
};

Class A {}; -- same class name solved

Class B inherits A {

	fb1(pb1 : Int, pb2 : A) : B {1};
	fb2(pb1 : Int, pb1 : A) : B {1};  --same argumant name solved
	fb3(pb1 : Int) : A {1};
	fb4() : Int {1};
	fb4(pb1 : Int) : Int {1}; --same method name solved
	
	
	aa1 : Bool; --same attribute in father
	
	ab1 : Int;
	ab2 : A; 
};

Class Sina inherits C {};

Class C inherits B {
	fc2() : A {1};
	fc4(pc1 : Int) : A {1};
	fc5() : Object {1};
	
	fa4(pa1 : Int, pa2 : Int) : A {1};  --redefine method with wrong in number of formal list
	fa4(pa1 : Bool) : A {1};  --redefine method with wrong formal type
	fa4(pa1 : Int) : B {1};  --redefine method with wrong Return type
	
	aa1 : A; --same attribute in grandfather
};


Class Mai inherits IO {   -- there is no Main class

	am1 : A;
	fm1(pm1 : Int) : A {1};		
	mai() : Object {1};   --firs edit class name To Main then test there is no method main() in Class Main
};			    

