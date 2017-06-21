Script sample runs as 	
	# start of the file
	
	buildWall at row: 2 col: 7
	buildWall at row: 1 col: 1
	dropMark at row: 4 col: 4
	pickMark at row: 5 col: 3
	
	if not heading west or not not full and wall ahead do
		turnLeft
		step
		drop
	end	
	
	removeWall
	
	while mark and not heading east do
		trace "picking up a mark"
		pick
		trace "ouch it's hot"
		drop
		
		# get outta here
		turnLeft
		turnLeft
		repeat 5 times step end
		
	end
	
	routine removeWall means
		destroyWall at row: 2 col: 7
	end
	
end