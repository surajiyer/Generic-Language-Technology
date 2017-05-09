module TestParser

import BaseGrammar;
import ParseTree;

public start[Program] program(str s) {
	return parse(#start[Program], s);
}

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

public str s2 = "Script sample runs as
	while not heading south do
		turnLeft
	end
	while not mark and not wall ahead do
		step
	end
end";

public str s3 = "Script sampleScene runs as
	buildWall at row: 1 col: 4
	buildWall at row: 2 col: 4
	dropMark at row: 4 col: 3
end";

public str s4 = "Script sample runs as
	routine turnRight means
		repeat 3 times
			turnLeft
		end
	end
	
	# now can call turnRight
	turnRight
end";