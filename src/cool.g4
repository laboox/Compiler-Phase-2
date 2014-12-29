grammar cool;

cool: program;

program	:	{System.out.println("1");}	(clas ';')+;

clas    :   {System.out.println("2");}	CLASS TYPE (INHERITS TYPE)? '{' (feature ';')* '}'; 

feature :   {System.out.println("3");}	(OBJECT '(' (formal (',' formal)*)? ')' ':' TYPE '{' expr '}')
        |   {System.out.println("4");}  (OBJECT ':' TYPE ('<-' expr)?);

formal  :   {System.out.println("5");}  OBJECT ':' TYPE;

expr    :   {System.out.println("6");}	OBJECT '<-' expr
		| 	not;
		
not     :	{System.out.println("24");}	NOT not				
		|	comp;
		
comp    : 	addsub comp2;
comp2   : 	{System.out.println("21");}	'<'  addsub comp2
		| 	{System.out.println("22");}	'<=' addsub comp2
		| 	{System.out.println("23");}	'='  addsub comp2 
		| 	;

addsub  : 	muldiv addsub2;
addsub2 : 	{System.out.println("16");}	'+' muldiv addsub2 
		| 	{System.out.println("17");}	'-' muldiv addsub2 
		| 	;
		
muldiv  : 	voidd muldiv2;
muldiv2 : 	{System.out.println("18");}	'*' voidd muldiv2 
		| 	{System.out.println("19");}	'/' voidd muldiv2 	
		| 	;
		
voidd   : 	{System.out.println("15");}	ISVOID voidd 	
		| 	target;
		
target  : 	{System.out.println("20");}	'~'target	
		| 	call;
		
call	: 	func call2;

call2	: 	{System.out.println("7");}	('@' TYPE)? '.' OBJECT '(' (expr (',' expr)*)? ')' call2
		|	;

func	: 	{System.out.println("8");}	OBJECT '(' (expr (',' expr)*)? ')'
		| 	end;
		

end		:	{System.out.println("9");}  IF expr THEN expr ELSE expr FI
		| 	{System.out.println("10");} WHILE expr LOOP expr POOL
		| 	{System.out.println("11");}	'{'(expr ';')+ '}'
		|	{System.out.println("12");} LET OBJECT ':' TYPE ('<-' expr)? (',' OBJECT ':' TYPE ('<-' expr)?)* IN expr
		|	{System.out.println("13");} CASE expr OF (OBJECT ':' TYPE '=>' expr';')+ ESAC	
		| 	{System.out.println("14");}	NEW TYPE 	
		|	{System.out.println("25");}	'(' expr ')' 
		| 	{System.out.println("26");}	OBJECT			
		| 	{System.out.println("27");}	INTEGER			
		| 	{System.out.println("28");}	STRING				
		| 	{System.out.println("29");}	TRUE					
		| 	{System.out.println("30");}	FALSE;
		
IF          : [Ii][Ff];
FI          : [Ff][Ii];
CLASS       : [Cc][Ll][Aa][Ss][Ss];
ELSE        : [Ee][Ll][Ss][Ee];
IN          : [Ii][Nn];
INHERITS    : [Ii][Nn][Hh][Ee][Rr][Ii][Tt][Ss];
ISVOID      : [Ii][Ss][Vv][Oo][Ii][Dd];
LET         : [Ll][Ee][Tt];
LOOP        : [Ll][Oo][Oo][Pp];
POOL        : [Pp][Oo][Oo][Ll];
THEN        : [Tt][Hh][Ee][Nn];
WHILE       : [Ww][Hh][Ii][Ll][Ee];
CASE        : [Cc][Aa][Ss][Ee];
ESAC        : [Ee][Ss][Aa][Cc];
NEW         : [Nn][Ee][Ww];
OF          : [Oo][Ff];
NOT         : [Nn][Oo][Tt];
TRUE        : 't'[Rr][Uu][Ee];
FALSE       : 'f'[Aa][Ll][Ss][Ee];
fragment DIGIT  : [0-9];
INTEGER     : DIGIT+;
fragment IDTAIL : [A-Za-z0-9_]*;
TYPE        : [A-Z]IDTAIL;
OBJECT     	: [a-z]IDTAIL;
SELF        : 'self';
SELF_TYPE   : 'SELF_TYPE';
STRING      : ('"' ~'"'* '"');
SINGLE_COMMENT  : ('--' ~('\r' | '\n')*) -> skip;
MULTI_COMMENT   : ('(*' .* '*)') -> skip;
WS          : (' '|'\n'|'\t'|'\r') -> skip;
