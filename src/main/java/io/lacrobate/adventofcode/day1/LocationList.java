package io.lacrobate.adventofcode.day1;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class LocationList {
	private List<Integer> leftIds = new ArrayList<>();
	private List<Integer> rightIds = new ArrayList<>();

	public int calculateDistance() {
		checkSizeEquality();
		sortLists();

		int distance = 0;
		for (int i = 0; i < leftIds.size(); i++) {
			distance += Math.abs(leftIds.get(i) - rightIds.get(i));
		}
		return distance;
	}

	/**
	 *
	 * @param inputLine : line from input file. formatted as : "10245   25635"
	 */
	public void enrichFrom(String inputLine, String delimiter) {
		String[] wordsOfCurrentLine = inputLine.split(delimiter);
		if (wordsOfCurrentLine.length == 0) {
			return;
		} else if (wordsOfCurrentLine.length == 1) {
			throw new IllegalStateException("asymitrical file man... asymitrical");
		}

		leftIds.add(Integer.valueOf(wordsOfCurrentLine[0]));
		rightIds.add(Integer.valueOf(wordsOfCurrentLine[1]));

	}

	public void checkSizeEquality() {
		if (leftIds.size() != rightIds.size()) {
			throw new IllegalStateException("wrong size man... wrong size");
		}
	}

	public void sortLists() {
		Collections.sort(leftIds);
		Collections.sort(rightIds);
	}
}