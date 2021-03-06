package com.kete.sportmonks.library.model.season;

import com.kete.sportmonks.library.model.group.Group;
import com.kete.sportmonks.library.model.group.GroupsData;
import com.kete.sportmonks.library.model.league.League;
import com.kete.sportmonks.library.model.league.LeagueData;
import com.kete.sportmonks.library.model.match.MatchDetail;
import com.kete.sportmonks.library.model.match.MatchsResponse;
import com.kete.sportmonks.library.model.stage.Stage;
import com.kete.sportmonks.library.model.stage.StagesData;

import java.util.List;

public class SeasonData 
{
	private int id = -1;
	private String name = null;
	private int league_id = -1;
	private boolean is_current_season = false;
	private int current_round_id = -1;
	private int current_stage_id = -1;
	private MatchsResponse results = null;
	private LeagueData league = null;
	private StagesData stages = null;
	private GroupsData groups = null;
	
	public SeasonData(){}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getLeagueId() {
		return league_id;
	}

	public boolean isCurrentSeason() {
		return is_current_season;
	}

	public int getCurrentRoundId() {
		return current_round_id;
	}

	public int getCurrentStageId() {
		return current_stage_id;
	}

	public List<MatchDetail> getListOfMatches() {
		if (results != null)
			return results.getListOfMatches();
		else return null;
	}
	
	public League getLeague() {
		if (league != null)
			return league.getData();
		else return null;
	}
	
	public List<Stage> getListOfStages() {
		if (stages != null)
			return stages.getListOfStages();
		else return null;
	}
	
	public List<Group> getListOfGroups() {
		if (groups != null)
			return groups.getListOfGroups();
		else return null;
	}
}
