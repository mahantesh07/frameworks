package com.hibernate.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="music_table")
public class MusicDTO implements Serializable {

	@Id
	@Column(name="music_name")
	private String name;
	
	@Column(name="music_artist")
	private String Artist;
	
	@Column(name="music_length")
	private double Length;
	
	@Column(name="year_of_release")
	private int YearOfRelease;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		this.Length = length;
	}

	public int getYearOfRelease() {
		return YearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}

	public MusicDTO() {

	}

}
