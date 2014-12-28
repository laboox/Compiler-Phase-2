
Class X inherits String {};  -- inheretance error string
Class Y inherits Int {}; -- inheretance error Int
Class Z inherits Bool {}; -- inheretance error Bool

Class T inherits IO {}; --true inheritance
Class K inherits Object {}; --true inheritance



Class A inherits IO { 
	
	abort() : Object {1}; --true redefine
	--abort(pa1 : Int) : Object {1}; -- redefine error parametr
	--abort() : A {1}; -- redefine error Return type
	
	type_name() : String {1}; --true redefine
	--type_name(pa1 : Int) : String {1}; -- redefine error parametr
	--type_name() : A {1}; -- redefine error Return type
	
	copy() : SELF_TYPE {1}; --true redefine
	--copy(pa1 : Int) : SELF_TYPE {1}; -- redefine error parametr
	--copy() : A {1}; -- redefine error Return type
	
};