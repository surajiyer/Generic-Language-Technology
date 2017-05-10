Script sample runs as 
	# turn right
	repeat 3 times
		turnLeft
	end
	
	step
	
	if mark do
		pick
		trace "Found and picked the mark!"
	end
end