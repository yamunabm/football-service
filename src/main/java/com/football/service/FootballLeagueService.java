package com.football.service;

import com.football.exception.FootballServiceException;
import com.football.io.TeamStandingRequest;
import com.football.io.TeamStandingResponse;

public interface FootballLeagueService {
	
	public TeamStandingResponse getTeamStanding(TeamStandingRequest teamStandingRequest) throws FootballServiceException;

}
