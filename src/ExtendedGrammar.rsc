module ExtendedGrammar

import BaseGrammar;

keyword Keywords = Keywords | "not" | "and" | "or"
	| "buildWall" | "destroyWall" | "pickMark" | "dropMark" | "at" | "row" | "col"
	| "routine" | "means";

//Logical expression extension
syntax Expression = "not"? Expression;
syntax Expression = Expression ("and"|"or")? Expression;

//Scene construction extension
syntax GridCommand = "buildWall" | "destroyWall" | "pickMark" | "dropMark";
syntax ConstructionStatement = GridCommand "at" "row"[:] Integer "col"[:] Integer;

syntax Statement = ConstructionStatement;

//Bonus Extension
syntax Routine = "routine" Name "means" Statement* "end";