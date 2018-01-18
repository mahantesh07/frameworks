package com.app.namedquery;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
@Entity
@Table(name="game_table")
@NamedQueries({@NamedQuery(name="getByDuration",query="from GameDTO where duration=:duration")
				,@NamedQuery(name="getByName", query = "from GameDTO where gameName=:name")
				,@NamedQuery(name = "delete", query = "delete from GameDTO where gameName=:name")})
public class GameDTO implements Serializable{
	@Id
	@Column(name="gameName")
	private String gameName;
	@Column(name="numberOfPlayers")
	private int numberOfPlayers;
	@Column(name="type")
	private String type;
	@Column(name="duration")
	private int duration;
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
