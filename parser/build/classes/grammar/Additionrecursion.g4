grammar Additionrecursion;

program:(statement)+;

statement: println ';'
         | print ';'
         | varDeclarationList ';'
         | varDeclaration ';'
         | assignment ';'
         | branch
         | do_while ';'
         | while_statement
         | incrementation ';'
         | decrement ';'
         | forLoop 
         | arrayAssignment ';'
         | charArray ';'
         | returnStatement ';'
         ;

expression: lft= expression '/' rght=expression #Div
                | lft=expression '*' rght=expression #Mult
                | lft=expression '-' rght=expression #Minus
                | lft=expression '+' rght=expression #Plus
                | lft=expression operator = ('<'| '<=' | '>' |'>=') rght=expression #Relational
                | lft=expression '&&' rght=expression #And
                | lft=expression '||' rght=expression #Or
		| number=NUM #Number
                | txt= STRING #String
                | varName=IDENTIFIER #Variable 
                ;

varDeclaration: 'static' 'int' varName= IDENTIFIER '=' exp= expression #StaticVarDeclaration 
                |'int' varName=IDENTIFIER '=' exp = expression   #VarDeclarationAndAssignment
                |'int' varName=IDENTIFIER   #SimpleVarDeclaration
                | ',' varName= IDENTIFIER	#ListDeclaration
                ;
				
				
varDeclarationList: varDeclarationList varDeclaration
		| varDeclaration
		;

assignment: varName=IDENTIFIER '=' expr=expression  #directVarAssignment
            | 'scanf(' '"%d"' ',' '&' varName = IDENTIFIER ')' #InputVar
            ;

println: 'printf(' text = STRING ',' varName = IDENTIFIER  ')' #PrintStatementAndVariable
         | 'printf(' text = STRING ',' varName = IDENTIFIER ',' variableName = IDENTIFIER ')'   #Print_Two_Variables
         | 'printf(' text=STRING ',' varName= IDENTIFIER ',' variableName = IDENTIFIER ',' expr= expression ')' #Print_three
         | 'printf(' argument=expression ')' #simplePrintStatement 
         ;

print: 'print(' argument=expression ')' ;

branch: 'if' '(' lft=expression operator = ('<'| '<=' | '>' |'>=') rght=expression ')' onTrue=block 'else' onFalse=block    #CompareStatements_if
        | 'if' '(' left_condition = expression operator= '||' right_condition = expression ')' instruction = statement      #If_statement_Or
        |'if' '(' condition= expression ')' onTrue=block 'else' onFalse=block #OtherIfStatements
       ;

do_while : 'do' loop=block 'while' '(' left_condition= expression operator = '||' right_condition= expression ')'   #DoWhile_Or
          | 'do' loop=block 'while' '(' condition= expression ')'   #SimpleDoWhile
          ;

while_statement: 'while' '(' condition = expression ')' loopCondition= block;

block: '{'statement* '}';

userInput: 'UserInputReader.readInt()';

incrementation: varName= IDENTIFIER '++';

decrement: varName= IDENTIFIER '--';

forLoop: 'for' '('  initialization=forInitialization  ';' condition = expression ';' change=forChange ')' loopCondition= block ;

forInitialization: varDeclaration   #DeclareVariable_For
                 | assignment       #AssignVariable_For
                 ;

forChange: incrementation
           | decrement
           ;

charArray: 'char' arrayName= IDENTIFIER '[' varName= IDENTIFIER ']'; 

arrayAssignment: 'scanf(' '"%c"' ',' '&' arrayName=IDENTIFIER '[' number= expression ']' ')' ;

returnStatement: 'return' expression ;

NUM: [0-9]+;

NEWLINE : [\r\n]+ ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

WHITESPACE: [ \t\n\r]+ -> skip;

STRING: '"' .*? '"';

