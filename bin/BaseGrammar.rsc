module BaseGrammar

layout Whitespace = [\ \t\n\r]+;
lexical Name = [a-zA-Z]+ \ Keywords;
lexical Integer = [0-9]+;
lexical StringExpression = "\"" (![\"])* "\"";
lexical Comment = "#" (![#])* "\n";

keyword Keywords = "Script" | "runs" | "as" | "end" | 
	"step" | "turnLeft" | "drop" | "pick" | "trace" |
	"full" | "mark" | "wall" | "ahead" | "heading" |
	"north" | "south" | "east" | "west" |
	"if" | "do" | "else" | "while" | "repeat" | "times";

syntax Command = "step" | "turnLeft" | "drop" | "pick" | ("trace" StringExpression);

syntax Direction = "north" | "south" | "east" | "west";
syntax Expression = "full" | "mark" | ("wall" "ahead") | ("heading" Direction);

syntax IfStatement = "if" Expression "do" Command+ 
	("end" | ("else" "do" Command+ "end"));

syntax WhileStatement = "while" Expression "do" Command+ "end";

syntax RepeatStatement = "repeat" Integer "times" Command+ "end";

syntax Statement = Command | IfStatement | WhileStatement | RepeatStatement | Comment;

start syntax Program = "Script" Name "runs" "as" Statement* "end";