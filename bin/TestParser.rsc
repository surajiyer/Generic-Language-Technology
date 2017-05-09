module TestParser

import ParseTree;
import BaseGrammar;

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

public loc l1 = |project://GLT-assignments/test/test.robot|;

public Program program(str s) {
	return parse(#Program, s);
}

public Program program(loc l) {
	return parse(#Program, l);
}