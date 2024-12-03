package io.lacrobate.adventofcode.common;

import io.lacrobate.adventofcode.day1.LocationList;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Slf4j
public class InputReader {
	private static String INPUT_PATH = "src/main/resources";
	private static String DELIMITER = "   ";

	public static LocationList read(String fileName) throws IOException {
		Path directory = Paths.get(INPUT_PATH);
		Path file = directory.resolve(fileName);
		LocationList locations = new LocationList();

		try (Stream<String> lines = Files.lines(file)) {
			lines.forEach(line -> locations.enrichFrom(line, DELIMITER));
		}
		return locations;
	}
}
