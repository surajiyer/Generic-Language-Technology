module ExtendedGrammar

import BaseGrammar;
import IO;

keyword Keywords = "not" | "and" | "or" | "buildWall" | "destroyWall" | 
	"pickMark" | "dropMark" | "at" | "row:" | "col:" | ":" | "routine" | "means";

//Logical expression extension
syntax Expression = ("not" Expression) | (Expression ("and"|"or") Expression);

//Scene construction extension
syntax GridCommand = "buildWall" | "destroyWall" | "pickMark" | "dropMark";
syntax ConstructionStatement = GridCommand "at" "row:" Integer "col:" Integer;

syntax Statement = ConstructionStatement | addRoutine: Routine r | existsRoutine: Name r;

//Bonus Extension
syntax Routine = routine: "routine" Name "means" Statement* "end";
data Rtx = routine(str name, list[str] statements);
set[Name] routines = {};

public void addRoutine(Routine r) {
	routines = routines + [Name] implode(#Rtx, r).name;
}

public void existsRoutine(Name r) {
	if(r notin routines)
		filter;
}