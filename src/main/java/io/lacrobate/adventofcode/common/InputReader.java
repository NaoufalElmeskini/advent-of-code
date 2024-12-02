package io.lacrobate.adventofcode.common;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class InputReader {

	public static void read() throws IOException {
		String inputPath = "src/main/resources";
		Path directory = Paths.get(inputPath);
		Path file = directory.resolve("input.txt");

		try (Stream<String> lines = Files.lines(file)) {
			List<List<String>> records = lines.map(line -> {
				log.info(line);
				String delimiter = "   ";
				return Arrays.asList(line.split(delimiter));
			}).collect(Collectors.toList());
		}
	}

	//	public static String writeSoundBytesToGivenFile(byte[] bytes, String fileName) {
	//		Path directory = Paths.get(INPUT_RESOURCES_PATH);
	//		Path filePath = directory.resolve(fileName);
	//		try {
	//			Files.write(filePath, bytes, StandardOpenOption.CREATE_NEW);
	//			System.out.printf("Saved %s to %s%n", fileName, INPUT_RESOURCES_PATH);
	//			return fileName;
	//		} catch (IOException e) {
	//			throw new UncheckedIOException("Error writing audio to file", e);
	//		}
	//	}
}
