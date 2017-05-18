Script sample runs as 	
	# start of the file
	
	step
	step
	trace "Just did two steps"
	
	routine turnAround means
		repeat 2 times
			turnLeft
		end
	end
			
	while not wall ahead do
		step
		if mark do
			trace "mark found"
			pick
		else do drop
		end
	end
	
	# we hit a wall
	turnAround
	
end