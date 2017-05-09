module TestParser

import BaseGrammar;
import ParseTree;

public str s1 = "Script sample runs as
	# turn right
	repeat 3 times
		turnLeft
	end
	step
	if mark do
		pick
		trace \"Found and picked the mark!\"
	end
end";

public start[Program] program(str s) {
	return parse(#start[Program], s);
}